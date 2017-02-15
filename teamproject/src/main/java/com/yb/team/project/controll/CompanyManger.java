package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/1/20.
 */
@Controller
public class CompanyManger {
    @RequestMapping(value = "/roommanger")
    public String mannger() {
        return "/company/roommanger";
    }

    @RequestMapping(value = "/companybookrecord")
    public String bookRecord() {
        return "/company/companybookrecord";
    }

    @RequestMapping(value = "/setting")
    public String setting() {
        return "/company/setting";
    }


}