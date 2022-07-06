package com.SampleJPA.Project.Repository;

import com.SampleJPA.Project.Models.ProductGrouping;
import com.SampleJPA.Project.Models.ProductGroupingKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
public interface GroupJpaRepository extends JpaRepository<ProductGrouping, ProductGroupingKey> {

        List<ProductGrouping> findByKeyGroupId(String groupId);
}
