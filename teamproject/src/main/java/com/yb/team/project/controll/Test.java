package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
public class Test {
    @RequestMapping(value = "/test")
    public String test(ModelMap mdelMap) {
        mdelMap.addAttribute("test", "hello , this is velocity!");
        return "/testView/testVelocity.vm";
    }
}
