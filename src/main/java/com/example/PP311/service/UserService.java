package com.example.PP311.service;

import com.example.PP311.dao.UserDao;
import com.example.PP311.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUser(long id) {
        return userDao.findById(id).orElse(null);
    }

    public void createUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(long id) {
        userDao.deleteById(id);
    }
}
