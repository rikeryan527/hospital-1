package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.User;
import java.util.List;

public interface UserService {
    User getUserByName(String name);
    List<User> getAllUsers();
    void addUser(User user);

    /*
    * 用户登录
    * @param user 用户对象
    * */
    User signIn(User user);
    User signUp(User user);
    User resetPassword(User user);
}