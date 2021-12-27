package com.arikanogluulku.thirdhomework.controller;

import com.arikanogluulku.thirdhomework.converter.UserConverter;
import com.arikanogluulku.thirdhomework.dto.UserDto;
import com.arikanogluulku.thirdhomework.entity.User;
import com.arikanogluulku.thirdhomework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<UserDto> findAll() {
        List<User> userList = userService.findAll();
        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserToUserDto(userList);
        return  userDtoList;
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable String id) {
      User user = userService.findById(id);
      UserDto userDto = UserConverter.INSTANCE.convertUserToUserDto(user);
      return userDto;
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody UserDto userDto) {
     User user = UserConverter.INSTANCE.convertUserDtoToUser(userDto);
     user = userService.save(user);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
         userService.delete(id);
    }


}
