package com.yb.team.project.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by duqi on 15/8/19.
 */

@Controller
public class ShowUser {
    @RequestMapping(value = "/showUser")
    public String showUser() {
        //1.调用BLL层的服务接口
        //2.设置模型数据
        //3.返回逻辑视图名称
        return "showUser";
    }
}