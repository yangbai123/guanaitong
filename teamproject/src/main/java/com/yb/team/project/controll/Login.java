package com.yb.team.project.controll;

import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.UserServices;
import com.yb.team.project.until.YbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
public class Login {
    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/login")
    public String index() {
        return "/login/login";
    }

    @ResponseBody
    @RequestMapping(value = "/logined",method = RequestMethod.POST)
    public String getLogin(HttpServletRequest request, HttpSession session) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        if (YbUtil.isNotEmpty(account) && YbUtil.isNotEmpty(password)) {
            UserTable userTable = new UserTable();
            UserTable resultUserTable;
            if (YbUtil.isPhoneLegal(account)) {
                userTable.setPhoneNumber(Long.parseLong(account));
                userTable.setPassword(password);
                resultUserTable = userServices.getLoginByPhone(userTable);
            }
            else if (YbUtil.isEmailLegal(account)){
                userTable.setEmail(account);
                userTable.setPassword(password);
                resultUserTable = userServices.getLoginByEmail(userTable);
            }
            else {
                return "error";
            }
            if (resultUserTable != null) {
                session.setAttribute("Session_User", resultUserTable);
                session.setAttribute("Session_UserName", resultUserTable.getAccount());
                if (resultUserTable.getIsAdmin() == true || resultUserTable.getLoginerType() == true) {
                    return "company";
                } else {
                    return "person";
                }
            } else {
                return "error";
            }
        }
        else {
            return "empty";
        }
    }
}

