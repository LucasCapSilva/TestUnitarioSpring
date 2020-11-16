package com.generation.org.apidemo.controller;


import com.generation.org.apidemo.model.User;
import com.generation.org.apidemo.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
public class UserController
{


    private final UserService userService;

    public UserController( UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping( "/user/{id}" )
    public User getUser( @PathVariable String id )
    {
        return userService.getUser( id );
    }

    @PostMapping( "/user" )
    public User newUser( @RequestBody User user )
    {
        return userService.save( user );
    }

    @PutMapping( "/user" )
    public User updateUser( @RequestBody User user )
    {
        return userService.save( user );
    }

    @DeleteMapping( "/user/{id}")
        public void deleteUser( @PathVariable String id  )
    {
        userService.delete( id );
    }


}
