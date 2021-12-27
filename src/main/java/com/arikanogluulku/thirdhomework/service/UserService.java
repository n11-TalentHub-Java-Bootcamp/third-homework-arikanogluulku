package com.arikanogluulku.thirdhomework.service;

import com.arikanogluulku.thirdhomework.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findById(String id);

    User save(User user);

    void delete(String id);
}
