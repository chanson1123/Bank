package com.example.demo.test;

import com.example.demo.test.model.User;
import com.example.demo.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setEmail("lara@gmail.com");
        user.setFullName("Lara Croft");
        user.setPassword("123456");
        userService.saveUser(user);
        User result = userService.getUserByEmail(user.getEmail());
        assertEquals(user, result);
        userService.deleteUser(user.getId());
    }

    @Test
    public void testGetUsers() {

    }

    @Test
    public void testGetUserById() {

    }

    @Test
    public void testGetUserByEmail() {

    }

    @Test
    public void testDeleteUser() {

    }

}
