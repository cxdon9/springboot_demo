package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Map select() {
        Map map = new HashMap();
        List list = userDao.selectAll();
        int total = list.size();
        map.put("rows",list);
        map.put("total",total);
        return map;
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void delete(User user) {
        userDao.deleteByPrimaryKey(user.getUsid());
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

}
