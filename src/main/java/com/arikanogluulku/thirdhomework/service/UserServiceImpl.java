package com.arikanogluulku.thirdhomework.service;

import com.arikanogluulku.thirdhomework.entity.User;
import com.arikanogluulku.thirdhomework.service.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityService userEntityService;

    @Override
    public List<User> findAll() {
        return userEntityService.findAll();
    }
    @Override
    public User findById(String id) {
        return userEntityService.findById(id);
    }
    @Override
    public User save(User user) {
        return userEntityService.save(user);
    }
    @Override
    public void delete(String id) {
        userEntityService.deleteById(id);
    }
}
