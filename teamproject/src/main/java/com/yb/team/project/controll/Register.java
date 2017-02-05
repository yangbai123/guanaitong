package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/5.
 */
@Controller
public class Register {
    @RequestMapping(value = "/personregister")
    public String personRegister(){
        return "/personregister";
    }
    @RequestMapping(value = "/companyregister")
    public String companyregister(){
        return "/companyregister";
    }
    @RequestMapping(value = "/registernext")
    public String registerNext() {
        return "/registernext";
    }
    @RequestMapping(value = "/registersuccess")
    public String reisterSuccess(){
        return "/registersuccess";
    }
}
