package com.SampleJPA.Project.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category_status")
    private String categoryStatus;


}
