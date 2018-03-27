package com.idrawings.shopdriver.controller;

import com.idrawings.shopdriver.api.ShopFlowProcess;
import com.idrawings.shopdriver.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by White Stream on 02.06.2017.
 */
@RestController
@RequestMapping("/main")
public class SaveProductController {

    private final ShopFlowProcess shopFlowProcess;

    @Autowired
    public SaveProductController(ShopFlowProcess shopFlowProcess) {
        this.shopFlowProcess = shopFlowProcess;
    }

    @PostMapping
    public void saveProduct(@RequestBody ProductDTO productDTO) {
        shopFlowProcess.saveProduct(productDTO);
    }

}
