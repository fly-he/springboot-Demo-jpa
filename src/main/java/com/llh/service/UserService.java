package com.llh.service;

import com.llh.dao.UserRepositoty;
import com.llh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by llh on 2018-02-11
 */
@Service
public class UserService {

    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userRepositoty.findByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
