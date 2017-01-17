package com.yb.team.project.controll;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/1/17.
 */
@Controller
public class Action {
    @RequestMapping(value="hello")
    public ModelAndView printWelcome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav= new ModelAndView();
        mav.addObject("city","test");
        mav.setViewName("hello");
        return mav;
    }
}
