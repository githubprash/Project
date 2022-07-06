package com.SampleJPA.Project.Controllers;

import com.SampleJPA.Project.Models.ProductDetails;
import com.SampleJPA.Project.Models.ProductGrouping;
import com.SampleJPA.Project.Repository.GroupJpaRepository;
import com.SampleJPA.Project.Repository.ProductJpaRepository;
import com.SampleJPA.Project.Service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;


    @GetMapping(value="/search/{groupId}")
    public List<ProductGrouping> findByGroupId(@PathVariable String groupId) {
        //return groupJpaRepository.getGroupInfo(groupId);
        return groupService.findByKeyGroupId(groupId);

    }
}
