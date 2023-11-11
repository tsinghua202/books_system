package com.domebook.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domebook.dao.BookDao;
import com.domebook.domain.Book;
import com.domebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService {

}
