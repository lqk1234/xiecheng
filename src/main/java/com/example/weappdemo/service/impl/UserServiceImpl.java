package com.example.weappdemo.service.impl;
import com.example.weappdemo.bean.User;
import com.example.weappdemo.commer.ResponseData;
import com.example.weappdemo.mapper.UserMapper;
import com.example.weappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @author lqk
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResponseData saveUser(User user) {
        return ResponseData.ok( userMapper.insert(user));
    }
}
