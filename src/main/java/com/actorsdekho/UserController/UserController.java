package com.actorsdekho.UserController;

import com.actorsdekho.Model.User;
import com.actorsdekho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){

        User savedUser =  userRepository.save(user);

        return savedUser;

    }
    public User findByEmail(String email) throws Exception {
        User user =  userRepository.findByEmail(email);
        if(user==null){
            throw new Exception("User Not Found This Email"+email);
        }
        return user;
    }
}
