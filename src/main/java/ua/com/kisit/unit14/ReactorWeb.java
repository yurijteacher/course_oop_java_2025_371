package ua.com.kisit.unit14;

import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

public class ReactorWeb {

    public static void main(String[] args) throws InterruptedException {

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Vasya", "Pypkin", 17));
        users.add(new User(2L, "Iva", "Pypkina", 18));
        users.add(new User(3L, "Ivanka", "Pypkina", 16));


        //
        List<User> userList =  users
                                    .stream()
                                    .sorted(Comparator
                                            .comparing(User::getAge))
                                    .toList();

        userList.stream().forEach(e-> System.out.println(e));

        //
        List<User> userList1 = users
                                    .parallelStream()
                                    .sorted(Comparator.comparing(User::getAge))
                                    .toList();
        userList1.stream().forEach(e-> System.out.println(e));


        // Flux / Mono

        Mono.empty();
        Flux.empty();

        Mono<String> text = Mono.just("Vasya Pypkin");
        text.subscribe(e-> System.out.println(e));

        Flux<Integer> flux = Flux.range(1,10);
        flux.subscribe(e-> System.out.println(e));

        Flux<User> userFlux = Flux.fromIterable(userList).delayElements(Duration.ofSeconds(1));
        userFlux.subscribe(e-> System.out.println(e));

        Flux.<String>generate(e->
                e.next("Hello World!!"))
                .take(10)
                .subscribe(e-> System.out.println(e));

        Flux.generate(
                ()->200,
                (state, sink)-> {

                    if (state>250) {
                        sink.complete();
                    } else {
                        sink.next(state);
                    }
                    return state + 5;
                }
        ).subscribe(e-> System.out.println(e));


        Mono<User> userMono = userFlux.elementAt(1);
        Flux<User> userFlux1 = Mono.just(new User(1L, "WE","WEr",12)).flux();


        userFlux1.subscribe(e-> System.out.println(e));


        HandlerFunction<ServerResponse> helloWorld = req ->
                ServerResponse
                        .ok()
                        .contentType(MediaType.TEXT_PLAIN)
                        .bodyValue("Hello World!!");

        HandlerFunction<ServerResponse> usersFlux = reg ->
                ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(userFlux, User.class);

        RouterFunction<ServerResponse> routers = RouterFunctions
                .route(GET("/"), helloWorld)
                .andRoute(GET("/users"), usersFlux);


        HttpHandler handlers = RouterFunctions.toHttpHandler(routers);

        HttpServer
                .create()
                .port(8080)
                .handle(new ReactorHttpHandlerAdapter(handlers))
                .bindNow();

        Thread.currentThread().join();
    }


}
