package com.dfire.service.impl;

import com.dfire.entity.Admin;
import com.dfire.mapper.AdminMapper;
import com.dfire.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ch on 2017/7/15.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int checkAdmin(Admin admin) {
        return adminMapper.check(admin);
    }
}
