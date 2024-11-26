package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.User;
import org.huhehai.hospital.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}