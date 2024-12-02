package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUserByName(String name);
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUserByAccountName(String accountName);
    //注册
    User getUserByPhoneNumberAndPassword(User user);
    //登录
    User getUserByAccountNameAndPassword(User user);
    //修改密码
    User resetPassword(User user);
      //通过手机验证码登录
    //找回密码+重置密码（通过手机验证码）

    //修改个人信息
        //修改密码
        //修改头像
        //修改手机号

    //实名认证
        //添加本人实名信息
        //添加家庭成员

}