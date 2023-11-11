package com.domebook.service;

import com.domebook.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void gatAll(){

        bookService.list();
    }

    @Test
    void saves(){

        Book book = new Book();

        book.setName("挪威的森林");
        book.setType("文学类小说");
        book.setDescription("日本小说家春上椿树著作");

        boolean i = bookService.save(book);

        if (i){
            System.out.println("成功");
        }
    }

    @Test
    void delete(){

       boolean i =  bookService.removeById(4);
       if (i) {
           System.out.println("成功");
       }
    }
}
