package com.SampleJPA.Project.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ProductGroupingKey implements Serializable {

    private static final long serialVersionUID = 9080232610837437620L;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "variant_id")
    private String variantId;

}