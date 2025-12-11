package ua.com.kisit.unit11.repository;

import org.junit.Before;
import org.junit.Test;
import ua.com.kisit.unit11.entity.Category;

import java.util.List;

import static org.junit.Assert.*;

public class CategoryRepositoryTest {

    CategoryRepository categoryRepository;

    @Before
    public void setUp() {
        categoryRepository = new CategoryRepository();
    }

    @Test
    public void FirstTest(){

        int a = 5;
        int b = 5;

        int c = a + b;

        assertEquals(10, c);
    }


    @Test
    public void save() {

        Category category = new Category();
        category.setName("apple");
        category.setDescription("apple description");
        category.setImage("/image/apple.jpg");

//        categoryRepository.save(category);

        assertEquals(2, categoryRepository.findAll().size());


    }

    @Test
    public void findAll() {

        List<Category> categories = categoryRepository.findAll();

        assertEquals(2,categories.size());

    }
}