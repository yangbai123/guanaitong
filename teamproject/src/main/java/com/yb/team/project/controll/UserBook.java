package com.yb.team.project.controll;

import com.yb.team.project.model.ShowParam;
import com.yb.team.project.service.BookService;
import com.yb.team.project.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/2/5.
 */

@Controller
public class UserBook {
    @Autowired
    ManagementService managementService;
    @Autowired
    BookService bookService;

    @RequestMapping(value ="/roombook")
    public String roomBook(){
        return "/person/roombook";
    }

    @ResponseBody
    @RequestMapping(value = "/roomsearch")
    public List<String> roomSearch(HttpServletRequest request){
        return managementService.roomSearch();
    }

    @ResponseBody
    @RequestMapping(value = "/booksearch")
    public List<ShowParam> bookSearch(@RequestParam(value = "date")String date){
        System.out.println(date);
        List<ShowParam> showParams = bookService.bookSearch(date);
        for (ShowParam showParam:showParams) {
            if (showParam.getBookPeople().equals("yangbai")){
                showParam.setId("mybook");
            }else {
                showParam.setId("booked");
                showParam.setDate("");
                showParam.setMettingTheme("");
                showParam.setBookPeople("");
            }
        }
        return showParams;
    }

    @RequestMapping(value = "/bookrecord")
    public String boolRecord(){
        return "/person/bookrecord";
    }
}
