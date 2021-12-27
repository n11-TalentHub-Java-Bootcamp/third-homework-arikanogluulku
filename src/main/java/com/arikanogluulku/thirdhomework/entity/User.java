package com.arikanogluulku.thirdhomework.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Getter
@Setter
public class User {
    @Id
    private String id;

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String userName;

}
