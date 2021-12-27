package com.arikanogluulku.thirdhomework.service.entityService;

import com.arikanogluulku.thirdhomework.entity.User;
import com.arikanogluulku.thirdhomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserEntityService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent()){
            user =  optional.get();
        }
        return user;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public void deleteById(String id){
        userRepository.deleteById(id);
    }

}
