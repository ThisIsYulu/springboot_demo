package com.yulu.wang.service.impl;

import com.yulu.wang.entity.User;
import com.yulu.wang.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yulu on 2018/11/23.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("yulu");
        return user;
    }
}
