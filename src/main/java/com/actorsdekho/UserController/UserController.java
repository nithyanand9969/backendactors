package com.actorsdekho.UserController;

import com.actorsdekho.Model.User;
import com.actorsdekho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) throws Exception {
        User isExist =  userRepository.findByEmail(user.getEmail());
        if(isExist!=null){
            throw new Exception("user is exist"+ " " +user.getEmail());
        }

        User savedUser =  userRepository.save(user);

        return savedUser;

    }
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable Long userId) throws Exception
    {
        userRepository.deleteById(userId);

        return "User Deleted Successfully";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){

        List<User> users = userRepository.findAll();
        return users;
    }
}
