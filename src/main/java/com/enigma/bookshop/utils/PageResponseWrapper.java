package com.enigma.bookshop.utils;

import org.springframework.data.domain.Page;

import java.util.List;

public class PageResponseWrapper<T> {
    private List<T> data;
    private Long totalElement;
    private Integer totalPages;
    private Integer pege;
    private Integer size;

    public PageResponseWrapper(Page<T> page) {
        this.data = page.getContent();
        this.totalElement = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.pege = page.getNumber();
        this.size = page.getSize();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(Long totalElement) {
        this.totalElement = totalElement;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPege() {
        return pege;
    }

    public void setPege(Integer pege) {
        this.pege = pege;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
