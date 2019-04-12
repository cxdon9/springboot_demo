package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public Map select();
    public List<User> selectAll();
    public void delete(User user);
    public void insert(User user);
}
