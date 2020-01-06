package com.xust.controller;

import com.xust.entity.User;
import com.xust.mapper.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: Victor
 * @create: 2020-01-05 15:43
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDao userDao;
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/edit/{user_name}")
    public String edit(@PathVariable("user_name")String name, Model model) {
        User user = userDao.check(name);
        logger.info(user.toString());
        model.addAttribute("user",user);
        return "edit";
    }

    @RequestMapping("/delete/{user_name}")
    public String delete(@PathVariable("user_name") String name,Model model) {
        userDao.delete(name);
        List<User> list = userDao.getAll();
        model.addAttribute("user",list);
        return "user_list";
    }

    @RequestMapping("/to_add/{user_name}")
    public String update(@PathVariable("user_name")String name,Model model, @RequestParam("address")String address,@RequestParam("number")String number,@RequestParam("postid")Integer postid,@RequestParam("email")String email) {
        User user = new User(name,address,number,postid,email);
        userDao.update(user);
        List<User> list = userDao.getAll();
        model.addAttribute("user",list);
        return "user_list";
    }

    @RequestMapping("/to_insert")
    public String to_insert() {
        return "add";
    }
    @RequestMapping("/insert")
    public String insert(@RequestParam("name") String name,Model model, @RequestParam("address")String address,@RequestParam("number")String number,@RequestParam("postid")Integer postid,@RequestParam("email")String email) {
        User user = new User(name,address,number,postid,email);
        boolean b = userDao.insert(user);
        if(b) {
            List<User> list = userDao.getAll();
            model.addAttribute("user", list);
            return "user_list";
        }else{
            return "error";
        }
    }

    @RequestMapping("/group")
    public String order(@RequestParam("type")String type,Model model){
        List<User> list = userDao.order(type);
        model.addAttribute("user",list);
        return "user_list";
    }
}
