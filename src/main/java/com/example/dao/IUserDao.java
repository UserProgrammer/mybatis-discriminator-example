package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {
  List<User> getUsers();

  User getUserById(@Param("userId") Long userId);
}
