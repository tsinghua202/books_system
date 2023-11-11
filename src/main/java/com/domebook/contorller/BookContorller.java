package com.domebook.contorller;

import com.domebook.contorller.util.R;
import com.domebook.domain.Book;
import com.domebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookContorller {

    @Autowired
    private BookService bookService;

    @GetMapping
    public R gatAll(){
        return new R(bookService.list());
    }

    @PostMapping
    public R saves(@RequestBody Book book){
        return new R(true,bookService.save(book));
    }

    @PutMapping
    public R updateById(@RequestBody Book book){
        return new R(true,bookService.updateById(book));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){

        return new R(bookService.getById(id));
    }

    @DeleteMapping("{id}")
    public R deleteById(@PathVariable Integer id){
        return new R(true,bookService.removeById(id));
    }
}
