package com.as.kataboot.dao;

import com.as.kataboot.model.User;

import java.util.List;

public interface UserDao {
    User getUserById(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(long id, User updateUser);

    void removeUserById(long id);
}