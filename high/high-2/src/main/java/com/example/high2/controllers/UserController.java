package com.example.high2.controllers;

import com.example.high2.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<User>();

    @GetMapping
    public List<User> getAllusers(){
        return users;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        users.add(user);
        return user;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user){
        for (var currentUser : users){
            if(currentUser.getId() == id){
                currentUser.setName(user.getName());
                currentUser.setAge(user.getAge());
                return currentUser;
            }
        }
        throw new IllegalArgumentException("User not found with id: " + id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        users.removeIf(user -> user.getId() == id);
    }
}
