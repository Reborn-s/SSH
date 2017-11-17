import com.reborn.mapper.UserMapper;
import com.reborn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.InputStream;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class UserMapperTest
{
    private SqlSessionFactory factory;
    @Before
    public void setUp() throws Exception
    {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory  = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void findUserById() throws Exception
    {
        SqlSession session1 = factory.openSession();
        SqlSession session2 = factory.openSession();
        SqlSession session3 = factory.openSession();

        UserMapper mapper1 = session1.getMapper(UserMapper.class);
        UserMapper mapper2 = session2.getMapper(UserMapper.class);
        UserMapper mapper3 = session3.getMapper(UserMapper.class);

        User user1 = mapper1.findUserById(1);
        System.out.println(user1);
        session1.close();

        User user = new User();
        user.setUsername("ella");
        user.setAddress("taipei");
        user.setSex("0");

        mapper2.insertUser(user);
        session2.commit();
        session2.close();

        User user3=  mapper3.findUserById(1);
        System.out.println(user3);
        session3.close();

    }

}