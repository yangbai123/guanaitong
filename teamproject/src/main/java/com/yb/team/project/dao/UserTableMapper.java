package com.yb.team.project.dao;

import com.yb.team.project.model.UserTable;

import org.springframework.stereotype.Repository;


@Repository
public interface UserTableMapper {
    Boolean personRegister(UserTable userTable);
    UserTable getLoginByEmail(UserTable userTable);
    UserTable getLoginByPhone(UserTable userTable);
}