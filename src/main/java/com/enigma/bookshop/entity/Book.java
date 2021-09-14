package com.enigma.bookshop.entity;


import javax.persistence.*;

@Entity
@Table (name = "mst_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Untuk auto increment
    private Integer id;
    private String title;
    private String description;
    private String publisher;
    private Integer year;
    private Integer page;
    private String language;
    private Integer price;

    // diutuhkan oleh ORM (Hibernate)
    public Book() {
    }

    public Book(Integer id, String title, String description, String publisher, Integer year, Integer page, String language, Integer price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.publisher = publisher;
        this.year = year;
        this.page = page;
        this.language = language;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
