package com.enigma.bookshop.repository;


import com.enigma.bookshop.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books, String> {
    List<Books> findBookByTitleContaining(String title);
}
