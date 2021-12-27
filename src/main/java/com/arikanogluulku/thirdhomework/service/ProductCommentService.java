package com.arikanogluulku.thirdhomework.service;

import com.arikanogluulku.thirdhomework.entity.ProductComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductCommentService {

    List<ProductComment> findAll();

    ProductComment findById(String id);

    ProductComment save(ProductComment productComment);

    void delete(String id);
}
