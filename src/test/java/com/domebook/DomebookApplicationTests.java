package com.domebook;

import com.domebook.dao.BookDao;
import com.domebook.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DomebookApplicationTests {

	@Autowired
	private BookDao bookDao;


	@Test
	void insert(){

		Book book = new Book();

		book.setName("挪威的森林");
		book.setType("文学类小说");
		book.setDescription("日本小说家春上椿树著作");
		int i = bookDao.insert(book);

		if (i > 0){

			System.out.println("成功");
		}
	}

	@Test
	void getById() {
		System.out.println(bookDao.selectById(1));
	}

}
