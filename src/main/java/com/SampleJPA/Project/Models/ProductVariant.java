package com.SampleJPA.Project.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="product_variant")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductVariant {
    @Id
    @Column(name="sku_code")
    private String skuCode;

    @Column(name="business_name")
    private String businessName;

    @Column(name="business_type")
    private String businessType;

    @Column(name="group_id")
    private String groupId;

    @Column(name="variant_id")
    private String variantId;

    @Column(name="product_id")
    private String productId;

    @Column(name="price")
    private Double price;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")
    private String longitude;



}
