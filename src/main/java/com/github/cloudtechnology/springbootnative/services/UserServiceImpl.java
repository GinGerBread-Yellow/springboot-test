package com.github.cloudtechnology.springbootnative.services;

import javax.annotation.Resource;

import com.github.cloudtechnology.springbootnative.dao.UserRepository;

import org.springframework.stereotype.Service;
import com.github.cloudtechnology.springbootnative.Models.*;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    public void saveUser(User user) {
        // may use dozermapper
        userRepository.save(user);
    }
    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
