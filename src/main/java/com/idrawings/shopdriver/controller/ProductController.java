package com.idrawings.shopdriver.controller;

import com.idrawings.shopdriver.api.ShopFlowProcess;
import com.idrawings.shopdriver.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by White Stream on 01.06.2017.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ShopFlowProcess shopFlowProcess;

    @Autowired
    public ProductController(ShopFlowProcess shopFlowProcess) {
        this.shopFlowProcess = shopFlowProcess;
    }

    @GetMapping
    public Iterable<Product> getAll() {
        return shopFlowProcess.getAllProducts();
    }

    @GetMapping("/url")
    public Iterable<String> getProductsURLs() {
        return shopFlowProcess.getProductsURLs();
    }

    @GetMapping("/id")
    public int getLatestProductID() {
        return shopFlowProcess.getLatestProductID();
    }

}