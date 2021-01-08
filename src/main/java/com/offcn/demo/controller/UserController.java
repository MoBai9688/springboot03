package com.offcn.demo.controller;

import com.offcn.demo.dao.UserDao;
import com.offcn.demo.pojo.User;
import com.offcn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("/user")
    public String deleteAll(){
        return null;
    }

    @DeleteMapping("/user/{id}")
    public String deleteOne ( @PathVariable("id") Long id){
        userService.deleteUser(id);
        return "删除成功";
    }

    @PutMapping("/user")
    public String adduser(@RequestBody User user){
        userService.createUser(user);
        return "添加成功";
    }

    @PostMapping("/user")
    public String updateuser(@RequestBody User user){
        userService.updateUser(user);
        return "修改成功";
    }

}
