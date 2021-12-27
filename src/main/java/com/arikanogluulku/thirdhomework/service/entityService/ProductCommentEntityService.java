package com.arikanogluulku.thirdhomework.service.entityService;

import com.arikanogluulku.thirdhomework.entity.ProductComment;
import com.arikanogluulku.thirdhomework.entity.User;
import com.arikanogluulku.thirdhomework.repository.ProductCommentRepository;
import com.arikanogluulku.thirdhomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll(){
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String id){
        Optional<ProductComment> optional = productCommentRepository.findById(id);
        ProductComment comment = null;
        if(optional.isPresent()){
            comment =  optional.get();
        }
        return comment;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentRepository.save(productComment);
    }

    public void deleteById(String id){
        productCommentRepository.deleteById(id);
    }

}
