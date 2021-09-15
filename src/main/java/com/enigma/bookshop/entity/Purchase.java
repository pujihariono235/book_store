package com.enigma.bookshop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trx_purchase")
public class Purchase {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "transaction_date")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date purchaseDate;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    private Double grandTotal;

    @OneToMany(mappedBy = "purchase")
    @JsonIgnoreProperties("purchase")
    private List<PurchaseDetail> purchaseDetailList = new ArrayList<>();

    public Purchase() {
    }

    public Purchase(String id, Date purchaseDate, Member member, Double grandTotal) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.member = member;
        this.grandTotal = grandTotal;
    }

    public Purchase(String id, Date purchaseDate, Member member, Double grandTotal, List<PurchaseDetail> purchaseDetailList) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.member = member;
        this.grandTotal = grandTotal;
        this.purchaseDetailList = purchaseDetailList;
    }

    public List<PurchaseDetail> getPurchaseDetailList() {
        return purchaseDetailList;
    }

    public void setPurchaseDetailList(List<PurchaseDetail> purchaseDetailList) {
        this.purchaseDetailList = purchaseDetailList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
