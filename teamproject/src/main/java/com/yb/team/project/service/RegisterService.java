package com.yb.team.project.service;

import com.yb.team.project.dao.UserTableMapper;
import com.yb.team.project.model.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/8.
 */
@Service
public class RegisterService {
    @Autowired
    UserTableMapper userTableMapper;
    public Boolean register(UserTable userTable){
        return userTableMapper.register(userTable);
    }
}
