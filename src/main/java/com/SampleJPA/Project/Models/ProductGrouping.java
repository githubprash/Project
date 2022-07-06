package com.SampleJPA.Project.Models;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.json.JSONArray;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_grouping")

public class ProductGrouping {
    @EmbeddedId
    private ProductGroupingKey key;
    @Column(name="product_id")
    private String productId;

    @Column(name="status")
    private String status;

   public List<String> getProductId(){
        try{
            //return new JSONArray(productId).toList().stream().map(Object::toString).collect(Collectors.toList());
            return new JSONArray(productId).toList().stream().map(Object::toString).collect(Collectors.toList());
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
