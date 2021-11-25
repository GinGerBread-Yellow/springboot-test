package com.github.cloudtechnology.springbootnative.dao;

import com.github.cloudtechnology.springbootnative.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}