package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/5.
 */
@Controller
public class UserBook {
    @RequestMapping(value ="/roombook")
    public String roomBook(){
        return "/person/roombook";
    }
    @RequestMapping(value = "/bookrecord")
    public String boolRecord(){
        return "/person/bookrecord";
    }
}
