package com.idrawings.shopdriver.api;

import com.google.common.collect.Lists;
import com.idrawings.shopdriver.domain.Brand;
import com.idrawings.shopdriver.domain.Product;
import com.idrawings.shopdriver.dto.ProductDTO;
import com.idrawings.shopdriver.infrastructure.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by White Stream on 01.06.2017.
 */
@Service
public class ShopFlowProcess {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public void addBrand(Brand brand) {
    }

    @Transactional
    public void saveProduct(ProductDTO productDTO) {
        productRepository.save(productDTO.getProduct());
    }

    public Iterable<String> getProductsURLs() {
        Iterable<Product> products = productRepository.findAll();
        return Lists.newArrayList(products).stream().map(Product::getUrl).collect(Collectors.toList());
    }

    public int getLatestProductID() {
        List<Product> products = Lists.newArrayList(productRepository.findAll());
        return products.isEmpty() ? 1 : products.get(products.size() - 1).getId();
    }
}
