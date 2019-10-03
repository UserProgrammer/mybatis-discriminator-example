package com.example.handler;

import com.example.dao.IUserDao;
import com.example.entity.User;

import java.util.List;

public class UserHandler {
  private IUserDao userDao;

  public List<User> getUsers() {
    return userDao.getUsers();
  }

  public User getUserById(Long userId) {
    return userDao.getUserById(userId);
  }

  public void setUserDao(IUserDao userDao) {
    this.userDao = userDao;
  }
}
