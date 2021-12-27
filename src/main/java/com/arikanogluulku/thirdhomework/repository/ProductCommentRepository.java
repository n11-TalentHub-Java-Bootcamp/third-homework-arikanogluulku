package com.arikanogluulku.thirdhomework.repository;

import com.arikanogluulku.thirdhomework.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCommentRepository extends MongoRepository<ProductComment , String> {

}
