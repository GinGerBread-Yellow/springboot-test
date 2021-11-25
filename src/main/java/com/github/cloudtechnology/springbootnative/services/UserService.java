package com.github.cloudtechnology.springbootnative.services;
import com.github.cloudtechnology.springbootnative.Models.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAll();
}
