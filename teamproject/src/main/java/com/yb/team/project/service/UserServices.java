package com.yb.team.project.service;

import com.yb.team.project.dao.UserTableMapper;
import com.yb.team.project.model.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/29.
 */
@Service
public class UserServices {
    @Autowired
    UserTableMapper userTableMapper;
    public UserTable getLoginByPhone(UserTable userTable){
        return userTableMapper.getLoginByPhone(userTable);
    }
    public UserTable getLoginByEmail(UserTable userTable){
        return userTableMapper.getLoginByEmail(userTable);

    }
}
