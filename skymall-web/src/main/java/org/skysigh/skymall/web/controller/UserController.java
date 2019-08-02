package org.skysigh.skymall.web.controller;

import org.skysigh.skymall.web.dao.UserDao;
import org.skysigh.skymall.web.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("findById")
    public User findById(long id) {
        User user = userDao.findById(id);
        System.out.println("user:" + user);
        return user;
    }

    @RequestMapping("add")
    public void add() {
        User user = new User();
        user.setNickName("adf");
        user.setPassword("dddd");
        user.setAccount("wck");
        user.setRealName("wck");
        userDao.add(user);
    }

    @RequestMapping("insert")
    public void insert(User user) {
        System.out.println("user:" + user);
        if (user == null || user.getAccount() == null || user.getPassword() == null) {
            logger.error("参数错误，或者id为空");
            return;
        }
        userDao.add(user);
    }

}
