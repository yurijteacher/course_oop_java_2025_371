package ua.com.kisit.reactor_core;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReactorJava {

    public static void main(String[] args) throws InterruptedException {

        Mono.empty();
        Flux.empty();

        Flux<Integer> flux = Flux.range(1, 10);
        flux.subscribe(e -> System.out.println(e));

        Flux<Integer> flux2 = Flux.just(1, 2, 3);
        flux2.subscribe(e -> System.out.println(e));
        Mono<String> mono = Mono.just("Hello");
        mono.subscribe(e -> System.out.println(e));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Flux<Integer> flux1 = Flux.fromIterable(list);
        flux1.subscribe(e -> System.out.println(e));

        Flux.<String>generate(el -> el.next("Hello World")).take(10).subscribe(el -> System.out.println(el));


        Flux.generate(() -> 2000,
                (state, sink) -> {
                    if (state > 2500) {
                        sink.complete();
                    } else {
                        sink.next(state);
                    }
                    return state + 3;
                }).subscribe(el -> System.out.println(el));


        Flux<User> users = Flux.just(
                new User(1L, "Vasya", "Pypkin", "s21@ukr.net"),
                new User(2L, "Iva", "Pypkina", "s22@ukr.net"),
                new User(3L, "Ivanna", "Pypkina", "s23@ukr.net")
        );


        HandlerFunction<ServerResponse> usersList = req ->
                ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(users, User.class);

        HandlerFunction<ServerResponse> helloWorld = req ->
                ServerResponse
                        .ok()
                        .contentType(MediaType.TEXT_PLAIN)
                        .bodyValue("Hello World");

        RouterFunction<ServerResponse> routers = RouterFunctions
                .route(RequestPredicates.GET("/"), helloWorld)
                .andRoute(RequestPredicates.GET("/users"), usersList);

        HttpHandler headers = RouterFunctions.toHttpHandler(routers);

        HttpServer.
                create().
                port(8080).
                handle(new ReactorHttpHandlerAdapter(headers))
                .bindNow();

         Thread.currentThread().join();
    }

}
