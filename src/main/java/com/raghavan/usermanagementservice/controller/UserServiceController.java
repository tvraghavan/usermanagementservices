package com.raghavan.usermanagementservice.controller;

import com.raghavan.usermanagementservice.model.User;
import com.raghavan.usermanagementservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class UserServiceController {

    @Autowired
    UserServices userServices;

    @GetMapping(path="/")
    public ResponseEntity<Flux<User>> findAll() {
        Flux<User> users = userServices.findAll();
        HttpStatus status = users !=null ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(users,status);
    }

    @PostMapping(path="/create")
    public ResponseEntity createUser(@RequestBody User user) {
        userServices.create(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
