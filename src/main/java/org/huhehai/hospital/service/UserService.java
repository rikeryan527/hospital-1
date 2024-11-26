package org.huhehai.hospital.service;

import org.huhehai.hospital.entity.User;
import java.util.List;

public interface UserService {
    User getUserByName(String name);
    List<User> getAllUsers();
    void addUser(User user);
}