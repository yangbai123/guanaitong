import com.yb.team.project.model.UserTable;
import com.yb.team.project.service.UserServices;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class Test2 {
    @Autowired
    UserServices userServices;
    @org.junit.Test
    public void test1(){
        UserTable userTable = new UserTable();
        userTable.setAccount("杨柏");
        System.out.println(userServices.selectByAccount(userTable).getCompanyId());
    }

    @org.junit.Test
    public void test2(){
        UserTable userTable = new UserTable();
        userTable.setEmail("2321321312@qq.com");
        System.out.println(userServices.selectByEmail(userTable).getCompanyId());
    }

    @org.junit.Test
    public void test3(){
        UserTable userTable = new UserTable();
        userTable.setPhoneNumber(18983673637l);
        System.out.println(userServices.selectByPhone(userTable).getCompanyId());
    }
    @org.junit.Test
    public void test4(){
        UserTable userTable = new UserTable();
        userTable.setLicenseKey("yangbai");
        userTable.setAccount("頑童国际有限公司");
        System.out.println(userServices.selectByLicence(userTable).getEmail());
    }

    @org.junit.Test
    public void test5(){
        UserTable userTable = new UserTable();
        userTable.setAccount("頑童国际有限公司");
        System.out.println(userServices.selectByCompanyName("頑童国际有限公司").getEmail());
    }
}
