package com.SampleJPA.Project.ServiceImpl;

import com.SampleJPA.Project.Models.ProductGrouping;
import com.SampleJPA.Project.Repository.GroupJpaRepository;
import com.SampleJPA.Project.Service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupJpaRepository groupJpaRepository;


    @Override
    public List<ProductGrouping> findByKeyGroupId(String groupId) {
        List<ProductGrouping>list=groupJpaRepository.findByKeyGroupId(groupId);
        return list;
    }
}
