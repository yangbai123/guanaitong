
import com.yb.team.project.dao.UserTableMapper;
import com.yb.team.project.model.UserTable;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

    @Autowired
    UserTableMapper userTableMapper;
    @org.junit.Test
    public void userTableTest(){
        UserTable userTable = new UserTable();
        userTable.setPhoneNumber(Long.parseLong("18945993676"));
        userTable.setPassword("yangbai");
        UserTable yangbai = userTableMapper.getLoginByPhone(userTable);
        System.out.println(yangbai.getLoginId()+yangbai.getIsAdmin());
    }
    @org.junit.Test
    public void userTableTest1(){
        UserTable userTable = new UserTable();
        userTable.setEmail("239123124@qq.com");
        userTable.setPassword("yangbai");
        UserTable yangbai = userTableMapper.getLoginByEmail(userTable);
        System.out.println(yangbai.getLoginId()+yangbai.getIsAdmin());
    }
    @org.junit.Test
    public void userTableTest2(){
        UserTable userTable = new UserTable();
        userTable.setAccount("laoshi");
        userTable.setEmail("239123124@qq.com");
        userTable.setPassword("yangbai");
        userTable.setPhoneNumber(Long.parseLong("18945993672"));
        userTable.setIsAdmin(true);
        userTable.setLoginerType(true);
        userTable.setRegistration("sdadsa");
        userTable.setLicenseKey("asdas");
        System.out.println(userTableMapper.personRegister(userTable));
    }
}
