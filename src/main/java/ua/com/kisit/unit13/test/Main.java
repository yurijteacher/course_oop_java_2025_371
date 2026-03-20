package ua.com.kisit.unit13.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.kisit.unit13.entity.Author;
import ua.com.kisit.unit13.repository.AuthorRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("data-source.xml");

        AuthorRepository authorRepository = (AuthorRepository) context.getBean("authorRepository");

        authorRepository.save(new Author("Iva Pypkin"));

        List<Author> authors = authorRepository.findAll();

        for (Author a : authors){
            System.out.println(a);
        }

    }

}
