package com.example.weappdemo.service;

import com.example.weappdemo.bean.User;
import com.example.weappdemo.commer.ResponseData;

/**
 * @author lqk
 */
public interface UserService {
    ResponseData saveUser(User user);
}
