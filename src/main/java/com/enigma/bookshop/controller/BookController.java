package com.enigma.bookshop.controller;

import com.enigma.bookshop.entity.Books;
import com.enigma.bookshop.service.BookService;
import com.enigma.bookshop.utils.PageResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/books")
    public Books createBook(@RequestBody Books book){
        return bookService.addBook(book);
    }

    @GetMapping("/books/{id}")
    public Books getBookByid(@PathVariable String id){
        return bookService.getBookId(id);
    }

    @GetMapping("/books")
    public List<Books> getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping("books/search")
    public List<Books> getTitle(@RequestParam String title){
        return bookService.getBookTitle(title);
    }

    @PutMapping("/books")
    public Books updateBook(@RequestBody Books book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

//    @GetMapping("/books")
//    public PageResponseWrapper<Books> getBookPage(@RequestParam(name =  "page", defaultValue = "0") Integer page,
//                                                  @RequestParam(name = "size", defaultValue = "3") Integer size,
//                                                  @RequestParam(name = "sortBy", defaultValue = "title") String sortBy,
//                                                  @RequestParam(name = "direction", defaultValue = "ASC") String direction){
//        Sort sort = Sort.by(Sort.Direction.fromString(direction), sortBy);
//        Pageable pageable = PageRequest.of(page, size, sort);
//        Page<Books> booksPage = bookService.getBookPage(pageable);
//        return new PageResponseWrapper<>(booksPage);
//    }


}
