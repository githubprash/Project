package com.SampleJPA.Project.Controllers;

import com.SampleJPA.Project.Data.ProductData;
import com.SampleJPA.Project.Models.ProductVariant;
import com.SampleJPA.Project.Repository.ProductVariantRepository;

import com.SampleJPA.Project.Service.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductVariantController {
    @Autowired
    private ProductVariantService productVariantService;

    @GetMapping(value="/variant_info/{productId}")
    public List<ProductVariant> findByProductId(@PathVariable String productId) {
       return productVariantService.findByProductId(productId);
    }
    @GetMapping(value="/variant_price")
    public List<Object> findPrice() {
        return productVariantService.findPrice();
    }

    @GetMapping(value="/info")
    public List<ProductData>getInfo(){
        return productVariantService.getInfo();
    }
}
