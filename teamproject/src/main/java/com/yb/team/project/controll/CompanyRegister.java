package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/8.
 */
@Controller
public class CompanyRegister {
    @RequestMapping(value = "/companyregister")
    public String companyregister(){
        return "/register/companyregister";
    }
    @RequestMapping(value = "/registernext")
    public String registerNext() {
        return "/register/registernext";
    }
    @RequestMapping(value = "/companysuccess")
    public String reisterSuccess(){
        return "/register/companysuccess";
    }
}
