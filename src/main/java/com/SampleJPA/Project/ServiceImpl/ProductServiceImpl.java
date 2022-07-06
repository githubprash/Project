package com.SampleJPA.Project.ServiceImpl;

import com.SampleJPA.Project.Models.ProductDetails;
import com.SampleJPA.Project.Repository.ProductJpaRepository;
import com.SampleJPA.Project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductJpaRepository productJpaRepository;


    @Override
    public ProductDetails findByProductId(String productId) {
        ProductDetails details=productJpaRepository.findByProductId(productId);
        return details;
    }
}
