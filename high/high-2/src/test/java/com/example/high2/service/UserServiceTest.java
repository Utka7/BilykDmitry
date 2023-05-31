package com.example.high2.service;

import com.example.high2.dao.UserDao;
import com.example.high2.dto.UserDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceTest {

    private UserService userService;

    @Mock
    UserDao userDao;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userDao);
    }

    @Test
    public void UserService_GetAllUsers_ExpectedResult() {
        var expectedUsers = new ArrayList<UserDto>();
        expectedUsers.add(new UserDto(1L, "John", 85));
        expectedUsers.add(new UserDto(2L, "Jane", 15));
        when(userDao.getAllUsers()).thenReturn(expectedUsers);
        List<UserDto> actualUsers = userService.getAllUsers();
        assertEquals(expectedUsers, actualUsers);
    }

    @Test
    public void UserService_CreateUser_ExpectedResult() {
        var user = new UserDto(1L, "John", 85);
        when(userDao.createUser(user)).thenReturn(user);
        UserDto createdUser = userService.createUser(user);
        assertEquals(user, createdUser);
    }

    @Test
    public void UserService_UpdateUser_ExpectedResult() {
        long userId = 1L;
        UserDto updatedUser = new UserDto(userId, "Updated Name",16);
        when(userDao.updateUser(userId, updatedUser)).thenReturn(updatedUser);
        UserDto updated = userService.updateUser(updatedUser);
        assertEquals(updatedUser, updated);
    }

    @Test
    public void UserService_DeleteUser_ExpectedResult() {
        long userId = 1L;
        userService.deleteUser(userId);
        verify(userDao, times(1)).deleteUser(userId);
    }

}