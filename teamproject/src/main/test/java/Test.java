
import com.yb.team.project.dao.ManagementMapper;
import com.yb.team.project.dao.PredestineMapper;
import com.yb.team.project.dao.UserTableMapper;
import com.yb.team.project.model.Predestine;
import com.yb.team.project.model.RoomMessage;
import com.yb.team.project.model.ShowParam;
import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.BookService;
import com.yb.team.project.service.ManagementService;
import com.yb.team.project.service.UserServices;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class Test {
    @Autowired
    BookService bookService;
    @Autowired
    UserTableMapper userTableMapper;
    @Autowired
    UserServices userServices;
    @Autowired
    ManagementMapper managementMapper;
    @Autowired
    ManagementService managementService;
    @org.junit.Test
    public void userTableTest(){
        UserTable userTable = new UserTable();
        userTable.setPhoneNumber(Long.parseLong("18945993676"));
        userTable.setPassword("yangbai");
        UserTable yangbai = userTableMapper.getLoginByPhone(userTable);
//        System.out.println(yangbai.getLoginId()+yangbai.getIsAdmin());
    }
    @org.junit.Test
    public void userTableTest1(){
        UserTable userTable = new UserTable();
        userTable.setEmail("239123124@qq.com");
        userTable.setPassword("yangbai");
        UserTable yangbai = userTableMapper.getLoginByEmail(userTable);
//        System.out.println(yangbai.getLoginId()+yangbai.getIsAdmin());
    }
    @org.junit.Test
    public void userTableTest2(){
        UserTable userTable = new UserTable();
        userTable.setAccount("laoshi");
        userTable.setEmail("239113114@qq.com");
        userTable.setPassword("yangbai");
        userTable.setPhoneNumber(Long.parseLong("18925993672"));
//        userTable.setCompanyId("的撒打算的");
        userTable.setIsAdmin(true);
        userTable.setLoginerType(true);
        userTable.setRegistration("sdadsa");
        userTable.setLicenseKey("asdas");
        System.out.println(userTableMapper.register(userTable));
    }
    @org.junit.Test
    public void userTableTest3(){
        UserTable userTable = new UserTable();
        userTable.setEmail("2391231214@qq.com");
        UserTable userTable1 = userServices.selectByEmail(userTable);
        System.out.println(userTable1.getAccount());
    }
    @org.junit.Test
    public void userTableTest4(){
        UserTable userTable = new UserTable();
        userTable.setPhoneNumber(18945993676l);
        UserTable userTable1 = userServices.selectByPhone(userTable);
        System.out.println(userTable1.getAccount());
    }
    @org.junit.Test
    public void userTableTest5(){
        UserTable userTable = new UserTable();
//        userTable.setCompanyId("国际");
        userTable.setLicenseKey("yangbai");
        UserTable userTable1 = userServices.selectByLicence(userTable);
        System.out.println(userTable1.getAccount());
    }
    @org.junit.Test
    public void userTableTest6(){
        List<String> list = managementMapper.roomSearch(2);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    @Autowired
    PredestineMapper predestineMapper;
    @org.junit.Test
    public void userTableTest7(){
        Predestine predestine = new Predestine();
        predestine.setMeetingTheme("我好爱你");
        predestine.setStartTime("12：00");
        predestine.setEndTime("22:00");
        predestine.setBooker("yangbai");
        predestine.setMeetingRoomid(2);
        predestine.setDate("2017-02-19");
        predestine.setDeviceName("花瓣,投影仪");
//        predestineMapper.BookSuccess(predestine);
    }
    @org.junit.Test
    public void userTableTest8(){
////        List<ShowParam> showParams = predestineMapper.BookByPerson("2017-02-18","平台中心会议室");
//        for (int i = 0; i < showParams.size(); i++) {
//            System.out.println(showParams.get(i).getEndTime());
//        }
    }
//    @org.junit.Test
//    public void userTableTest9(){
////        List<RoomMessage> roomMessages =  managementMapper.roomMessage("平台中心会议室");
//        System.out.println(roomMessages.size());
//        for (RoomMessage a:roomMessages) {
//            System.out.println(a.getMeetingRoom());
//        }
//    }
    @org.junit.Test
    public void userTableTest10(){
        System.out.println(managementMapper.roomSearch(1));
    }
//    @org.junit.Test
//    public void userTableTest11() {
//       List<ShowParam> showParams = bookService.bookSearch("2017-02-18")
//    }
}
