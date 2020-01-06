package com.xust.mapper.impl;

import com.xust.entity.Admin;
import com.xust.mapper.AdminDao;
//import com.xust.utils.SQLUtils;
import com.xust.mapper.UserDao;
import com.xust.utils.SQLUtils;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author: Victor
 * @create: 2020-01-04 18:06
 **/

public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin check(String name, String password) {
        return SQLUtils.check(name,password);
    }


}
