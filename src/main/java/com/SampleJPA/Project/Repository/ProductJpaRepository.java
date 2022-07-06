package com.SampleJPA.Project.Repository;


import com.SampleJPA.Project.Models.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductJpaRepository extends JpaRepository<ProductDetails, String> {
     ProductDetails findByProductId(String productId);
}
