package com.example.high2.dao;

import com.example.high2.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    private List<UserDto> users = new ArrayList<UserDto>();

    public List<UserDto> getAllUsers() {
        return users;
    }

    public UserDto createUser(UserDto user) {
        users.add(user);
        return user;
    }

    public UserDto updateUser(Long id, UserDto updatedUser){
        for (var currentUser : users){
            if(currentUser.getId() == id){
                currentUser.setName(updatedUser.getName());
                currentUser.setAge(updatedUser.getAge());
                return currentUser;
            }
        }
        throw new IllegalArgumentException("User not found with id: " + id);
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId() == id);
    }

}
