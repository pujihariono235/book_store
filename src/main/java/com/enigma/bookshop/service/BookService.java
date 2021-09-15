package com.enigma.bookshop.service;

import com.enigma.bookshop.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    public Books addBook(Books book);
    public Books getBookId(String id);
    public List<Books> getAllBook();
    public Books updateBook(Books book);
    public void deleteBook(String id);
    public Page<Books> getBookPage(Pageable pageable);
    List<Books> getBookTitle(String title);
}
