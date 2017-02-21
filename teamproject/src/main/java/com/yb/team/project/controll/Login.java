package com.yb.team.project.controll;

import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.UserServices;
import com.yb.team.project.until.YbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
public class Login {
    @Autowired
    private UserServices userServices;

    /**
     * 主页
     * @return
     */

    @RequestMapping(value = "/login")
    public String index() {
        return "/login/login";
    }


    /**
     *登陆验证
     * @param account
     * @param password
     * @param request
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/logined",method = RequestMethod.POST)
    public UserTable getLogin(@RequestParam String account,@RequestParam String password, HttpServletRequest request, HttpSession session) {
        UserTable resultUserTable = new UserTable();
        if (YbUtil.isNotEmpty(account) && YbUtil.isNotEmpty(password)) {
            UserTable userTable = new UserTable();

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
                userTable.setMessage("error");
                return userTable;
            }
            if (resultUserTable != null) {
                session.setAttribute("Session_User", resultUserTable);
                session.setAttribute("Session_UserName", resultUserTable.getAccount());
                if (resultUserTable.getIsAdmin() == true || resultUserTable.getLoginerType() == true) {
                    resultUserTable.setMessage("company");
                    return resultUserTable;
                } else {
                    resultUserTable.setMessage("person");
                    return resultUserTable;
                }
            } else {
                userTable.setMessage("error");
                return userTable;
            }
        }
        else {
            resultUserTable.setMessage("empty");
            return resultUserTable;
        }
    }
}

