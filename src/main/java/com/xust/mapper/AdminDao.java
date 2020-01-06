package com.xust.mapper;

import com.xust.entity.Admin;

/**
 * @author: Victor
 * @create: 2020-01-04 17:57
 **/

public interface AdminDao {
    public Admin check(String name, String password);
}
