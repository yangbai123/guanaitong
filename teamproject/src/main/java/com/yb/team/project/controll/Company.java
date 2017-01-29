package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/20.
 */
@Controller
public class Company {
    @RequestMapping(value = "/company")
    public String mannger(){
        return "/company";

    }
}
