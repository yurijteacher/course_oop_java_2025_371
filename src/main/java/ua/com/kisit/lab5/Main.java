package ua.com.kisit.lab5;


import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Categories category = new Categories();
        category.setId(1L);
        category.setName("Car");
        category.setDescription("Description ...");
        category.setImage("/static/1.jpg");

        System.out.println(category);

        Products product = new Products();
        product.setId(1L);
        product.setName("BMW 5");
        product.setDescription("Description ...");
        product.setPrice(new BigDecimal(400000));
        product.setCategory(category);

        System.out.println(product);

        Products product2 = new Products();
        product2.setId(2L);
        product2.setName("BMW 7");
        product2.setDescription("Description ...");
        product2.setPrice(new BigDecimal(500000));
        product2.setCategory(category);

        System.out.println(product2);

        Roles role = new Roles();
        role.setId(1L);
        role.setName("Admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("Manager");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("Users");


        Users user = new Users();
        user.setId(1L);
        user.setUsername("Admin");
        user.setPassword("1111");

        Set<Roles> roles = new HashSet<>();
        roles.add(role);
        roles.add(role2);

        user.setRoles(roles);

        System.out.println(user);

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("Vasya");
        customer.setLastName("Pypkin");
        customer.setEmail("v1@ukr.net");
        customer.setPhoneNumber("51324");
        customer.setUser(user);

        System.out.println(customer);


        Orders orders = new Orders();
        orders.setId(1L);
        orders.setCustomer(customer);
        orders.setDateCreated(new Date());

        ProductsHasOrders productsHasOrders = new ProductsHasOrders();
        productsHasOrders.setId(1L);
        productsHasOrders.setProduct(product);
        productsHasOrders.setOrder(orders);
        productsHasOrders.setQuantity(1);

        ProductsHasOrders productsHasOrders2 = new ProductsHasOrders();
        productsHasOrders2.setId(2L);
        productsHasOrders2.setProduct(product2);
        productsHasOrders2.setOrder(orders);
        productsHasOrders2.setQuantity(1);

        List<ProductsHasOrders> productsHasOrdersList = new ArrayList<>();
        productsHasOrdersList.add(productsHasOrders);
        productsHasOrdersList.add(productsHasOrders2);

        System.out.println(productsHasOrdersList);

        System.out.println(productsHasOrders);


    }

}
