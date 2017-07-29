package com.dfire.service.impl;

import com.dfire.entity.User;
import com.dfire.entity.result_entity.UserResult;
import com.dfire.mapper.UserMapper;
import com.dfire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ch on 2017/7/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<UserResult> groupBySex() {
        return userMapper.groupBySex();
    }
    @Override
    public List<UserResult> groupByAge() {
        return userMapper.groupByAge();
    }
}
