package com.arikanogluulku.thirdhomework.service;

import com.arikanogluulku.thirdhomework.entity.ProductComment;
import com.arikanogluulku.thirdhomework.service.entityService.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCommentServiceIml implements ProductCommentService {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @Override
    public List<ProductComment> findAll() {
        return productCommentEntityService.findAll();
    }

    @Override
    public ProductComment findById(String id) {
        return productCommentEntityService.findById(id);
    }

    @Override
    public ProductComment save(ProductComment productComment) {
        return productCommentEntityService.save(productComment);
    }

    @Override
    public void delete(String id) {
        productCommentEntityService.deleteById(id);
    }
}
