package com.xust.controller;

import com.xust.entity.Admin;
import com.xust.entity.User;
import com.xust.mapper.AdminDao;
import com.xust.mapper.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: Victor
 * @create: 2020-01-04 16:40
 **/

@Controller
@RequestMapping("/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    AdminDao adminDao;
    @Autowired
    UserDao userDao;
    @RequestMapping("/login")
    public String login(@RequestParam("login_adminname") String name, @RequestParam("login_password")String password, Model model) {
        Admin admin = adminDao.check(name,password);
        logger.info(admin.toString());
        if(admin.getId() != null) {
            List<User> list = userDao.getAll();
            model.addAttribute("user",list);
            return "user_list";
        }else return "error";
    }

//    @Autowired
//    AddAdminDao addadmin;
//    @RequestMapping("/regist")
//    public String regist(@RequestParam("register_username")String name,@RequestParam("register_password")String password){
//        Admin admin = check.check(name);
//        if(admin.getId() != null){
//            return "error";
//        }
//        boolean tag = addadmin.addAdmin(name,password);
//        if(!tag) return "error";
//        else return null;
//    }
}
