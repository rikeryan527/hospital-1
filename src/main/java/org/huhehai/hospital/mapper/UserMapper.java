package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    // 根据用户名查询用户信息
    User getUserByName(String name);

    // 查询所有用户信息
    List<User> getAllUsers();

    // 插入一条用户信息到 user 表
    void addUser(User user);

    // 根据账号名删除用户信息
    void deleteUserByAccountName(String accountName);

    // 通过账号名和密码查询用户信息，用于登录验证（正确返回用户信息，否则返回 null）
    User getUserByAccountNameAndPassword(String accountName, String passWord);

    // 通过手机号和密码查询用户信息，用于手机号登录验证（正确返回用户信息，否则返回 null）
    User getUserByPhoneNumberAndPassword(String phoneNumber, String passWord);

    // 根据手机号注册用户，插入新用户信息到 user 表
    void registerUserByPhone(User user);

    // 通过手机号重置用户密码
    void resetPassword(String phoneNumber, String newPassWord);




    //注册

    //登录

    //修改密码
 //通过手机验证码登录
//       根据手机号注册用户

    //找回密码+重置密码（通过手机验证码）

    //修改个人信息
        //修改密码
        //修改头像
        //修改手机号

    //实名认证
        //添加本人实名信息
        //添加家庭成员

}