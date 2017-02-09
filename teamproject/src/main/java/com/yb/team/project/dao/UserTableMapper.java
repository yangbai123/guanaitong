package com.yb.team.project.dao;

import com.yb.team.project.model.UserTable;

import org.springframework.stereotype.Repository;


@Repository
public interface UserTableMapper {
    Boolean personRegister(UserTable userTable);
    UserTable getLoginByEmail(UserTable userTable);
    UserTable getLoginByPhone(UserTable userTable);
    UserTable selectByEmail(UserTable userTable);
    UserTable selectByPhone(UserTable userTable);
    UserTable selectByLicencekey(UserTable userTable);
}