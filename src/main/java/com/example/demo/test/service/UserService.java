package com.example.demo.test.service;

import com.example.demo.test.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    boolean saveUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    User getUserByEmail(String email);
    boolean updateUser(User user);
    boolean deleteUser(int id);

}
