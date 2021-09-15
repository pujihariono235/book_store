package com.enigma.bookshop.service;

import com.enigma.bookshop.entity.Purchase;


public interface PurchaseService {

    public Purchase transaction(Purchase purchase);
}
