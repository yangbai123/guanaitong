package com.yb.team.project.controll;

import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.PersonRegisterService;
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
    PersonRegisterService personRegisterService;
    @RequestMapping(value = "/personregister")
    public String personRegister(){
        return "/register/personregister";
    }

    @RequestMapping(value = "/personsuccess")
    public String reisterSuccess(){
        return "/register/personsuccess";
    }
    @ResponseBody
    @RequestMapping(value = "/personregistered")
    public String personregistered(HttpServletRequest request) {
        String checkCode = request.getParameter("checkCode");
        if (checkCode.equals("7878")) {
            UserTable userTable = new UserTable();
            userTable.setAccount(request.getParameter("account"));
            userTable.setEmail(request.getParameter("email"));
            userTable.setPassword(request.getParameter("password"));
            userTable.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));
            userTable.setIsAdmin(false);
            userTable.setLoginerType(false);
            userTable.setLicenseKey((request.getParameter("licenseKey")));
            boolean resultRegister = personRegisterService.personRegister(userTable);
            if (resultRegister) {
                return "success";
            } else {
                return "error";
            }
        } else{
            return "checkerror";
        }
    }

}
