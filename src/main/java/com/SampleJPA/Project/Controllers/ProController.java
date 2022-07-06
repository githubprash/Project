package com.SampleJPA.Project.Controllers;


import com.SampleJPA.Project.Models.ProductDetails;
import com.SampleJPA.Project.Repository.ProductJpaRepository;
import com.SampleJPA.Project.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
class ProController {
    @Autowired
    private ProductService productService;





    @GetMapping(value = "/search{productId}")
    public ProductDetails findByProductId(@PathVariable String productId) {
       return productService.findByProductId(productId);
       // log.info(details.toString());

    }



}
