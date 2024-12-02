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

    // 根据用户名获取用户信息
    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    // 获取所有用户信息
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    // 添加用户信息
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    // 根据accountname删除用户信息
    //@Override
    public void deleteUser(String accountName) {
        userMapper.deleteUserByAccountName(accountName);
    }

    // 用户登录
    @Override
    public User signIn(User user){
        return userMapper.getUserByAccountNameAndPassword(user);
    }
    // 用户注册
    @Override
    public User signUp(User user){ userMapper.addUser(user);  return userMapper.getUserByPhoneNumberAndPassword(user);}
}