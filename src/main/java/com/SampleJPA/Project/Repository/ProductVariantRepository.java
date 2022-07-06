package com.SampleJPA.Project.Repository;

import com.SampleJPA.Project.Models.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductVariantRepository extends JpaRepository<ProductVariant,String> {

    List<ProductVariant> findByProductId(String productId);
    @Query(value = "select * from product_variant where price is not null limit 10",nativeQuery = true)
    List<ProductVariant> findPrice();

}
