package bid.blog521313.hzx;

import bid.blog521313.hzx.module1.entity.User;
import bid.blog521313.hzx.module1.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HzxApplicationTests {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void contextLoads() {
        User user = userService.getById(1L);
        System.out.println(user.toString());
    }
}