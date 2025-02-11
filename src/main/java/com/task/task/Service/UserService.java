package com.task.task.Service;

import org.springframework.stereotype.Service;

import com.task.task.Dto.UserDto;
import com.task.task.Entity.User;
import com.task.task.Mapper.UserMapper;
import com.task.task.Repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;

    public UserDto addUser (UserDto userDto){
        User user = UserMapper.mapUser(userDto);
        userRepository.save(user);
        return UserMapper.mapUserDto(user);
    }
     
    public UserDto findUser(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return new UserDto(
                user.getUserId(),
                user.getUsername(),
                user.getPassword()
                );
        } else {
            // Handle the case where the user is not found
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    
}
