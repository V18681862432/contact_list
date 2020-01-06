package com.xust.mapper;

import com.xust.entity.Admin;
import com.xust.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Victor
 * @create: 2020-01-04 17:34
 **/
@Component
public interface UserDao {

    public boolean insert(User user);
    public User check(String username);
    public List<User> getAll();
    public void delete(String name);
    public void update(User user);
    public List<User> order(String type);
}
