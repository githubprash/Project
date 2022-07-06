package com.SampleJPA.Project.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData {
        private String productId;
        private String brandName;
        private String productName;
        private String categoryStatus;
        private Double price;



}
