package com.arikanogluulku.thirdhomework.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "ProductComment")
@Getter
@Setter
public class ProductComment {
    @Id
    private String id;

    private String comment;

    private Date dateOfComment;

    private String productId;

    private String userId;

}
