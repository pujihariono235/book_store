package com.enigma.bookshop.controller;

import com.enigma.bookshop.entity.Book;
import com.enigma.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/books/{id}")
    public Book getBookByid(@PathVariable Integer id){
        return bookService.getBookId(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }

}
