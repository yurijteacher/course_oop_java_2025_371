package ua.com.kisit.unit11;

import ua.com.kisit.unit11.confin.ConnectionToDB;
import ua.com.kisit.unit11.entity.Category;
import ua.com.kisit.unit11.entity.Client;
import ua.com.kisit.unit11.entity.Products;
import ua.com.kisit.unit11.repository.CategoryRepository;
import ua.com.kisit.unit11.repository.ClientRepository;
import ua.com.kisit.unit11.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new ConnectionToDB().getConnection();

        Category category = new Category();
        category.setId(1L);
        category.setName("Beer");
        category.setDescription("Beer description");
        category.setImage("/images/1.jpg");

        CategoryRepository categoryRepository = new CategoryRepository();
//        categoryRepository.save(category);

        List<Category> categories = categoryRepository.findAll();

//        for (Category c : categories) {
//            System.out.println(c.getName()+","+c.getDescription()+","+c.getImage());
//
//        }

        Category category1 = categoryRepository.findById(1L);

        ProductRepository productRepository = new ProductRepository();
        Products product = new Products();
        product.setId(1L);
        product.setName("Beer");
        product.setDescription("Beer description");
        product.setImage("/images/1.jpg");
        product.setPrice(new BigDecimal(15.45));
        product.setCategory(category1);

//        productRepository.save(product);

        List<Products> products = productRepository.findAll();
        for (Products p : products) {
            System.out.println(p);
        }

        Client client = new Client();
        client.setUsername("admin");
        client.setPassword("1234");

        ClientRepository clientRepository = new ClientRepository();

        clientRepository.save(client);

        List<Client> clients = clientRepository.findAll();

        for (Client c : clients) {
            System.out.println(c);
        }








    }

}
