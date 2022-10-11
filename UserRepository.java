package com.dalwaricorps.managapp.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalwaricorps.managapp.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    public User findByEmail(String email);
}
