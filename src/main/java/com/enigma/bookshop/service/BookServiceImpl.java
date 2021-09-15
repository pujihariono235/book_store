package com.enigma.bookshop.service;

import com.enigma.bookshop.Constant.ResponsMessage;
import com.enigma.bookshop.entity.Books;
import com.enigma.bookshop.exception.DataNotFoundException;
import com.enigma.bookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Books addBook(Books book) {
        return bookRepository.save(book);
    }

    @Override
    public Books getBookId(String id) {
        verify(id);
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Books> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Books updateBook(Books book) {
        verify(book.getId());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(String id) {
        verify(id);
        bookRepository.deleteById(id);

    }

    @Override
    public Page<Books> getBookPage(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public List<Books> getBookTitle(String title) {
        return bookRepository.findBookByTitleContaining(title);
    }

    private void verify(String id){
        if (!bookRepository.findById(id).isPresent()){
            String message = String.format(ResponsMessage.NOT_FOUND_MESSAGE, "Customer", id);
            throw new DataNotFoundException(message);
        }
    }


}
