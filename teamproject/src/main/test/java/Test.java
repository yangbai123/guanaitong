
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
        System.out.println(yangbai.getAccount()+yangbai.getEmail());
    }
}
