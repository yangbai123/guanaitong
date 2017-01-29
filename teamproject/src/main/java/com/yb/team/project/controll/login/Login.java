package com.yb.team.project.controll.login;

import com.yb.team.project.dao.UserTableMapper;
import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.UserServices;
import com.yb.team.project.until.YbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
public class Login {
    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/login")
    public String index() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/logined")
    public String getLogin(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        if (YbUtil.isNotEmpty(account)&&YbUtil.isNotEmpty(password)){
            UserTable userTable = new UserTable();
            userTable.setPhoneNumber(Long.parseLong(account));
            userTable.setPassword(password);
            UserTable userTable1 = userServices.getLoginByPhone(userTable);
            if (userTable1!= null){
                return "success";
            }
            else {
                return "error";
            }
        }
        return null;
    }
}

