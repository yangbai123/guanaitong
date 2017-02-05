package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/20.
 */
@Controller
public class CompanyManger {
    @RequestMapping(value = "/roommanger")
    public String mannger() {
        return "/roommanger";
    }

    @RequestMapping(value = "/companybookrecord")
    public String bookRecord() {
        return "/companybookrecord";
    }

    @RequestMapping(value = "/setting")
    public String setting() {
        return "/setting";
    }


}