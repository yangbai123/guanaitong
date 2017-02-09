package com.yb.team.project.controll;

import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/2/9.
 */
@Controller
public class ExistVerify {
    @Autowired
    UserServices userServices;

    @ResponseBody
    @RequestMapping(value = "/emailverify")
    public String emailVerify(HttpServletRequest request) {
        String email = request.getParameter("email");
        UserTable userTable = new UserTable();
        userTable.setEmail(email);
        UserTable resultUserTable = userServices.selectByEmail(userTable);
        if (resultUserTable != null) {
            return "true";
        } else {
            return "false";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/phoneverify")
    public String phoneVerify(HttpServletRequest request) {
        String phoneNumber = request.getParameter("phoneNumber");
        System.out.println(phoneNumber);
        UserTable userTable = new UserTable();
        userTable.setPhoneNumber(Long.parseLong(phoneNumber));
        UserTable resultUserTable = userServices.selectByPhone(userTable);
        if (resultUserTable != null) {
            return "true";
        } else {
            return "false";
        }
    }
    @ResponseBody
    @RequestMapping(value = "/licenseverify")
    public String licenseVerify(HttpServletRequest request) {
        String licenseKey = request.getParameter("licenseKey");
        String companyName = request.getParameter("companyName");
        UserTable userTable = new UserTable();
        userTable.setLicenseKey(licenseKey);
        userTable.setCompanyName(companyName);
        UserTable resultUserTable = userServices.selectByLicence(userTable);
        if (resultUserTable != null) {
            return "true";
        } else {
            return "false";
        }
    }
}
