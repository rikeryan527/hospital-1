package org.huhehai.hospital.controller;

import org.huhehai.hospital.entity.User;
import org.huhehai.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 根据用户名查询用户信息
    @GetMapping("/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable String name) {
        User user = userService.getUserByName(name);
        if (user!= null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 获取所有用户信息（实际场景可能需考虑权限等，这里仅示例）
    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // 新增用户信息
    @PostMapping("")
    public ResponseEntity<Void> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}