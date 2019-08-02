package org.skysigh.skymall.web.dao;

import org.skysigh.skymall.web.po.User;

import java.util.List;

public interface UserDao {
    User findById(long id);
    void add(User user);
//    List<User> findAllUser();
//
//    User findUserByAccount(String account);
//
//    List<User> findUserByRealNameAndNickName(String realName, String nickName);
}
