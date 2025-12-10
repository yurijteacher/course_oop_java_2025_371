package ua.com.kisit.unit9.associations.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Category car = new Category();
        car.setId(1L);
        car.setName("Car");
        car.setImage("car.jpg");
        car.setDescription("car description");

        Category beer = new Category();
        beer.setId(2L);
        beer.setName("Beer");
        beer.setDescription("beer description");
        beer.setImage("beer.jpg");

        Product bmw5 = new Product();
        bmw5.setId(1L);
        bmw5.setName("BMW 5");
        bmw5.setDescription("BMW 5 description");
        bmw5.setImage("/static/1.jpg");
        bmw5.setCategory(car);

        Product bmw7 = new Product();
        bmw7.setId(2L);
        bmw7.setName("BMW 7");
        bmw7.setDescription("BMW 7 description");
        bmw7.setImage("/static/2.jpg");
        bmw7.setCategory(car);

        System.out.println(bmw5);
        System.out.println(bmw7);


        List<Product> products = new ArrayList<>();
        products.add(bmw5);
        products.add(bmw7);

        car.setProducts(products);


        System.out.println(car);

        products.stream().filter(product -> product.getCategory().getId().equals(1L)).forEach(product -> System.out.println(product));



    }

}
