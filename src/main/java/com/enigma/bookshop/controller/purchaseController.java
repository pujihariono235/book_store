package com.enigma.bookshop.controller;

import com.enigma.bookshop.entity.Purchase;
import com.enigma.bookshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class purchaseController {

    @Autowired
    PurchaseService purchaseService;


    @PostMapping("/transaction")
    Purchase transaction(@RequestBody Purchase purchase) {
        return purchaseService.transaction(purchase);
    }
}
