package com.yb.team.project.controll;

import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.RegisterService;
import com.yb.team.project.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/2/5.
 */
@Controller
public class PersonRegister {
    @Autowired
    RegisterService registerService;
    @Autowired
    UserServices userServices;

    /**
     * 个人注册界面
     * @return
     */
    @RequestMapping(value = "/personregister")
    public String personRegister() {
        return "/register/personregister";
    }

    /**
     * 个人注册成功界面
     * @return
     */
    @RequestMapping(value = "/personsuccess")
    public String reisterSuccess() {
        return "/register/personsuccess";
    }

    /**
     * 个人注册的实现和验证
      * @param request
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "/personregistered")
    public String personregistered(HttpServletRequest request) {
        String checkCode = request.getParameter("checkCode");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        if (checkCode.equals("7878")) {
            UserTable userTable = new UserTable();
            userTable.setAccount(request.getParameter("account"));
            userTable.setEmail(email);
            userTable.setPassword(request.getParameter("password"));
            userTable.setPhoneNumber(Long.parseLong(phoneNumber));
            userTable.setIsAdmin(false);
            userTable.setLoginerType(false);
            userTable.setLicenseKey((request.getParameter("licenseKey")));
            userTable.setCompanyName((request.getParameter("companyName")));
            boolean resultRegister = registerService.register(userTable);
            if (resultRegister) {
                return "success";
            } else {
                return "error";
            }
        } else {
            return "checkerror";
        }
    }

}
