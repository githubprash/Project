package com.SampleJPA.Project.Service;

import com.SampleJPA.Project.Models.ProductGrouping;

import java.util.List;

public interface GroupService {
    public List<ProductGrouping> findByKeyGroupId(String groupId);
}
