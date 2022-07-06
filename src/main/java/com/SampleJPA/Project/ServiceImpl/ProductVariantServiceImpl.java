package com.SampleJPA.Project.ServiceImpl;

import com.SampleJPA.Project.Data.ProductData;
import com.SampleJPA.Project.Models.ProductDetails;
import com.SampleJPA.Project.Models.ProductVariant;
import com.SampleJPA.Project.Repository.ProductJpaRepository;
import com.SampleJPA.Project.Repository.ProductVariantRepository;
import com.SampleJPA.Project.Service.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductVariantServiceImpl implements ProductVariantService {
    @Autowired
    private ProductVariantRepository variantRepository;
    @Autowired
    private ProductJpaRepository productJpaRepository;
 //   @Autowired
   // private ProductData productData;
    @Override
    public List<ProductVariant> findByProductId(String productId) {
        List<ProductVariant> variantList = variantRepository.findByProductId(productId);
        return variantList;
    }

    @Override
    public List<Object> findPrice() {
        try{
            List<Object>list=new ArrayList<>();
            List<ProductVariant>result=variantRepository.findPrice();
            result.forEach(e->{
                Map<String,Object> map = new HashMap<>();
                map.put("product_id",e.getProductId());
                map.put("price",e.getPrice());
                String pId=e.getProductId();
                String name= productJpaRepository.findByProductId(pId).getProductName();
                map.put("name", name);
                list.add(map);
            });
            return list;
        } catch (Exception e) {
            // System.out.println("inside catch 1");
            return null;
        }
    }

    @Override
    public List<ProductData> getInfo() {
        try{
            List<ProductData>infoList=new ArrayList<>();
            List<ProductVariant>result=variantRepository.findPrice();
            result.forEach(e->{
                String pid=e.getProductId();
                Double price=e.getPrice();
                String pName=productJpaRepository.findByProductId(pid).getProductName();
                String bName=productJpaRepository.findByProductId(pid).getBrandName();
                String cStatus=productJpaRepository.findByProductId(pid).getCategoryStatus();
                ProductData productData=new ProductData(pid,bName,pName,cStatus,price);

                infoList.add(productData);
            });
            return infoList;
        }catch (Exception e){
            System.out.println("ly bhari");
            return null;
        }

    }

}
