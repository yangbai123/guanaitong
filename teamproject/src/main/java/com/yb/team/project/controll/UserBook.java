package com.yb.team.project.controll;

import com.alibaba.druid.support.json.JSONUtils;
import com.yb.team.project.model.Predestine;
import com.yb.team.project.model.RoomMessage;
import com.yb.team.project.model.ShowParam;
import com.yb.team.project.service.BookService;
import com.yb.team.project.service.ManagementService;
import com.yb.team.project.until.YbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    /**
     * 用户预定界面
     * @return
     */
    @RequestMapping(value = "/roombook")
    public String roomBook() {
        return "/person/roombook";
    }

    /**
     * 查询所有的会议室的名称
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/roomsearch")
    public List<String> roomSearch(HttpServletRequest request,@RequestParam int companyId) {
        return managementService.roomSearch(companyId);
    }

    /**
     * 获取当前用户，在指定日期的预定记录
     * @param date
     * @param userName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/booksearch")
    public List<ShowParam> bookSearch(@RequestParam String date, @RequestParam String userName,@RequestParam int companyId) {
        System.out.println(userName);
        List<ShowParam> showParams = bookService.bookSearch(date,companyId);
        for (ShowParam showParam : showParams) {
            if (showParam.getBookPeople().equals(userName)) {
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

    /**
     * 判断指定会议室的指定时间是否被占用
     * @param date
     * @param startTime
     * @param endTime
     * @param place
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/personbook")
    public String personBook(@RequestParam int companyId,@RequestParam String date, @RequestParam String startTime, @RequestParam String endTime, @RequestParam String place) {
        List<ShowParam> showParams = bookService.personBook(date, place,companyId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        Date sBookDate = null;
        Date eBookDate = null;
        int isOk = 0;
        try {
            sBookDate = simpleDateFormat.parse(startTime);
            eBookDate = simpleDateFormat.parse(endTime);

            for (ShowParam showparam : showParams) {
                Date sBookedDate = null;
                Date eBookedDate = null;
                sBookedDate = simpleDateFormat.parse(showparam.getStartTime());
                eBookedDate = simpleDateFormat.parse(showparam.getEndTime());
                if (eBookDate.after(sBookedDate) && sBookDate.before(eBookedDate)) {
                    isOk = 1;
                    break;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (isOk == 1) {
            return "error";
        } else {
            return "success";
        }
    }

    /**
     * 获取会议室的信息
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/roommessage")
    public RoomMessage roomMessage(HttpServletRequest request,@RequestParam String room,@RequestParam int companyId) {
        List<RoomMessage> roomMessageList = managementService.roomMessage(room,companyId);
        List<String> deviceData = new ArrayList<String>();
        for (RoomMessage roomMessage : roomMessageList) {
            deviceData.add(roomMessage.getDeviceName());
        }
        RoomMessage returnData = new RoomMessage();
        returnData.setDeviceNames(deviceData);
        returnData.setStartTime(roomMessageList.get(0).getStartTime());
        returnData.setEndTime(roomMessageList.get(0).getEndTime());
        returnData.setMeetingRoom(roomMessageList.get(0).getMeetingRoom());
        return returnData;
    }

    /**
     * 根据前台发来的数据进行插入操作
     * @param date
     * @param startTime
     * @param endTime
     * @param place
     * @param meetingTheme
     * @param booker
     * @param device
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/booksuccess")

    public String bookSuccess(@RequestParam String date, @RequestParam String startTime,
                              @RequestParam String endTime, @RequestParam String place,
                              @RequestParam String meetingTheme, @RequestParam String booker,
                              @RequestParam String device,@RequestParam int companyId) {
        int id = managementService.roomIdSearch(place,companyId);
        Predestine predestine = new Predestine();
        predestine.setMeetingTheme(meetingTheme);
        predestine.setStartTime(startTime);
        predestine.setEndTime(endTime);
        predestine.setBooker(booker);
        predestine.setMeetingRoomid(id);
        predestine.setDate(date);
        predestine.setDeviceName(device);
        predestine.setCompanyId(companyId);
        int resultId = bookService.bookSuccess(predestine);
        if (resultId == 1)
            return "success";
        else
            return "error";
    }

    /**
     * 预定记录界面
     * @return
     */
    @RequestMapping(value = "/bookrecord")
    public String boolRecord() {
        return "/person/bookrecord";
    }

}
