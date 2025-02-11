package com.task.task.Mapper;

import com.task.task.Dto.UserDto;
import com.task.task.Entity.User;

public class UserMapper {
    public static UserDto mapUserDto (User user){
        return new UserDto(
            user.getUserId(),
            user.getUsername(),
            user.getPassword()
        );
    }
    public static User mapUser (UserDto userDto){
        return new User(
            userDto.getUsername(),
            userDto.getPassword()
        );
    }
}
