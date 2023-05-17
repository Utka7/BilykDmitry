package com.example.high2.service;

import com.example.high2.dao.UserDao;
import com.example.high2.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserDto> getAllUsers() {
        return userDao.getAllUsers();
    }

    public UserDto createUser(UserDto user) {
        return userDao.createUser(user);
    }

    public UserDto updateUser(UserDto user) {
        long id = user.getId();
        return userDao.updateUser(id, user);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

}
