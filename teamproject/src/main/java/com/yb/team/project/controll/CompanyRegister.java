package com.yb.team.project.controll;

import com.google.code.kaptcha.Constants;
import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.RegisterService;
import com.yb.team.project.until.YbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/2/8.
 */
@Controller
public class CompanyRegister {
    @Autowired
    RegisterService registerService;

    /**
     * 企业注册界面
     * @return
     */
    @RequestMapping(value = "/companyregister")
    public String companyregister() {
        return "/register/companyregister";
    }

    /**
     * 企业注册成功界面
     * @return
     */
    @RequestMapping(value = "/companysuccess")
    public String reisterSuccess() {
        return "/register/companysuccess";
    }

    /**
     *企业注册的实现和验证
     * @param request
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/companyregistered")
    public String personregistered(@RequestParam String checkCode,@RequestParam String email,@RequestParam String phoneNumber,
                                   HttpServletRequest request, HttpSession session) {
        System.out.println(checkCode);
        String sessionCode = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println(sessionCode);
        if (!checkCode.equalsIgnoreCase(sessionCode)) {
            return "checkerror";
        }
        UserTable userTable = new UserTable();
        userTable.setAccount(request.getParameter("account"));
        userTable.setEmail(email);
        userTable.setPassword(request.getParameter("password"));
        userTable.setPhoneNumber(Long.parseLong(phoneNumber));
        userTable.setIsAdmin(false);
        userTable.setLoginerType(true);
        userTable.setCompanyName((request.getParameter("companyName")));
        String licenseKey = YbUtil.generateShortUuid();
        userTable.setLicenseKey(licenseKey);
        boolean resultRegister = registerService.register(userTable);
        if (resultRegister) {
            return licenseKey;
        } else {
            return "error";
        }
    }

}
