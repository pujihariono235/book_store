package com.enigma.bookshop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "trx_purchase_detail")
public class PurchaseDetail {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private Double priceSell;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;

    public PurchaseDetail() {
    }

    public PurchaseDetail(String id, Double priceSell, Integer quantity, Purchase purchase) {
        this.id = id;
        this.priceSell = priceSell;
        this.quantity = quantity;
        this.purchase = purchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
