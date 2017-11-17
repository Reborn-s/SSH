import com.reborn.mapper.UserMapper;
import com.reborn.po.User;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class UserMapperTest
{
    private ApplicationContext context;
    @Before
    public void setUp() throws Exception
    {
        context = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
    }

    @org.junit.Test
    public void findUserById() throws Exception
    {
        UserMapper mapper = context.getBean(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }

}