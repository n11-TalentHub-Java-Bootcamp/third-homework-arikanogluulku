package com.arikanogluulku.thirdhomework.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProductCommentDto {
    private String commentId;

    private String comment;

    private Date dateOfComment;

    private String productId;

    private String userId;
}
