package mapper;

import com.reborn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

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

    @Test
    public void findUserById() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("dao.findUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findUserByName() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        List<User> users= sqlSession.selectList("dao.findUserByName", "Selina");
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void insetUser() throws Exception
    {
        SqlSession sqlSession = factory.openSession();

        User user=  new User();
        user.setUsername("ella");
        user.setAddress("taipei");
        user.setSex("0");

        sqlSession.insert("dao.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

}