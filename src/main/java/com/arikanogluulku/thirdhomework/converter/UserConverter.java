package com.arikanogluulku.thirdhomework.converter;

import com.arikanogluulku.thirdhomework.dto.UserDto;
import com.arikanogluulku.thirdhomework.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    @Mapping(target = "userId" , source = "id")
    UserDto convertUserToUserDto(User user);

    @Mapping(target = "userId" , source = "id")
    List<UserDto> convertAllUserToUserDto(List<User> userList);


    @Mapping(target = "id" , source = "userId")
    User convertUserDtoToUser(UserDto userDto);

    @Mapping(target = "id" , source = "userId")
    List<User> convertAllUserDtoToUser(List<UserDto> userDtoList);

}
