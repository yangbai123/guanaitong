package com.yb.team.project.controll;

import com.alibaba.druid.support.json.JSONUtils;
import com.yb.team.project.model.RoomMessage;
import com.yb.team.project.model.ShowParam;
import com.yb.team.project.service.BookService;
import com.yb.team.project.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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

    @RequestMapping(value = "/roombook")
    public String roomBook() {
        return "/person/roombook";
    }

    @ResponseBody
    @RequestMapping(value = "/roomsearch")
    public List<String> roomSearch(HttpServletRequest request) {
        return managementService.roomSearch();
    }

    @ResponseBody
    @RequestMapping(value = "/booksearch")
    public List<ShowParam> bookSearch(@RequestParam String date) {
        System.out.println(date);
        List<ShowParam> showParams = bookService.bookSearch(date);
        for (ShowParam showParam : showParams) {
            if (showParam.getBookPeople().equals("yangbai")) {
                showParam.setId("mybook");
            } else {
                showParam.setId("booked");
                showParam.setDate("");
                showParam.setMettingTheme("");
                showParam.setBookPeople("");
            }
        }
        return showParams;
    }

    @ResponseBody
    @RequestMapping(value = "/roommessage")
    public RoomMessage roomMessage(HttpServletRequest request) {
        String room = request.getParameter("room");
        List<RoomMessage> roomMessageList = managementService.roomMessage(room);
        List<String> deviceData = new ArrayList<String>();
        for (RoomMessage roomMessage : roomMessageList) {
            deviceData.add(roomMessage.getDeviceName());
        }
        RoomMessage returnData = new RoomMessage();
        System.out.println(roomMessageList.get(0).getStartTime());
        returnData.setDeviceNames(deviceData);
        returnData.setStartTime(roomMessageList.get(0).getStartTime());
        returnData.setEndTime(roomMessageList.get(0).getEndTime());
        returnData.setMeetingRoom(roomMessageList.get(0).getMeetingRoom());
        return returnData;
    }

    @RequestMapping(value = "/bookrecord")
    public String boolRecord() {
        return "/person/bookrecord";
    }
}
