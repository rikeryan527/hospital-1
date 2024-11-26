package org.huhehai.hospital.mapper;

import org.huhehai.hospital.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUserByName(String name);
    List<User> getAllUsers();
    void addUser(User user);
}