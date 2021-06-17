package com.example.demo.test.controller;

import com.example.demo.test.model.User;
import com.example.demo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    // create
    // POST /users
    @RequestMapping(value="/users/{user}", method=RequestMethod.POST)
    public boolean saveUser(@ModelAttribute("user") User user){
        boolean flag = userService.saveUser(user);
        return flag;
    }
    // read:
    // GET /users
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> getUsers(){
        List<User> list = userService.getUsers();
        return list;
    }
    // read one:
    // GET /users/id
    @RequestMapping(value="/users/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }
    // read by email
    // GET /users/email
    @RequestMapping(value="/users/{email}", method=RequestMethod.GET)
    public User getUserByEmail(@ModelAttribute("email") String email){
        User user = userService.getUserByEmail(email);
        return user;
    }
    // update:
    // PUT /users
    @RequestMapping(value="/users/{user}", method=RequestMethod.PUT)
    public boolean updateUser(@ModelAttribute("user") User user){
        boolean flag = userService.updateUser(user);
        return flag;
    }
    // delete:
    // DELETE /users/id
    @RequestMapping(value="/users/{id}", method= RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("id") Integer id){
        boolean flag = userService.deleteUser(id);
        return flag;
    }

}
