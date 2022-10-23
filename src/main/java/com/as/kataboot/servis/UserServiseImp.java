package com.as.kataboot.servis;

import com.as.kataboot.dao.UserDao;
import com.as.kataboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiseImp implements UserServise {
    private final UserDao userDao;

    public UserServiseImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(long id, User updateUser) {
        userDao.updateUser(id, updateUser);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }
}
