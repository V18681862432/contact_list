package com.xust.mapper.impl;

import com.xust.entity.Admin;
import com.xust.entity.User;
import com.xust.mapper.UserDao;
import com.xust.utils.SQLUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author: Victor
 * @create: 2020-01-04 17:35
 **/

public class UserDaoImpl implements UserDao {
    @Override
    public boolean insert(User user) {
        return SQLUtils.insert(user);
    }

    @Override
    public User check(String name) {
        User user = SQLUtils.query(name);
        return user;
    }

    @Override
    public void delete(String name) {
        SQLUtils.delete(name);
    }

    @Override
    public void update(User user) {
         SQLUtils.update(user);
    }

    @Override
    public List<User> order(String type) {
        return SQLUtils.order(type);
    }

    @Override
    public List<User> getAll() {
        List<User> list = SQLUtils.getAll();
        return list;
    }
}
