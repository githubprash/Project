package com.SampleJPA.Project.Service;

import com.SampleJPA.Project.Data.ProductData;
import com.SampleJPA.Project.Models.ProductVariant;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
public interface ProductVariantService {
    public List<ProductVariant> findByProductId(String productId);
    public List<Object> findPrice();

    List<ProductData> getInfo();
}
