package com.epapps.fakemarketplace.controllers;

import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class UserController {

    IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Long id){
        return userService.getById(id);
    }


}
