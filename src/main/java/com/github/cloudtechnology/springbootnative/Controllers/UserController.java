package com.github.cloudtechnology.springbootnative.Controllers;

import javax.annotation.Resource;

import com.github.cloudtechnology.springbootnative.Response;
import com.github.cloudtechnology.springbootnative.Models.User;
import com.github.cloudtechnology.springbootnative.services.UserService;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    UserService userService;

    @GetMapping(value="users")
    public Response getMethodName() {
        List<User> users = userService.getAll();
        log.info("users: "+users);
        return Response.succeed(users);
    }
    @PostMapping(value="users")
    public Response saveUser(@RequestBody User user) {
        userService.saveUser(user);
        log.info("save user:"+user);
        return Response.succeed(user);
    }
}
