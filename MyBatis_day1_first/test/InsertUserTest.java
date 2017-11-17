import com.reborn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class InsertUserTest
{
    @Test
    public void fun() throws IOException
    {
        String resources = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();

        User user = new User();
        user.setUsername("hebe");
        user.setBirthday(new Date(330));
        user.setAddress("taipei");
        user.setSex("0");

        sqlSession.insert("dao.insertUser",user);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void fun2() throws IOException
    {
        String resources = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();

        User user = new User();
        user.setUsername("Selina");
        user.setBirthday(new Date(330));
        user.setAddress("taipei");
        user.setSex("0");

        sqlSession.insert("dao.insertUserLastId",user);
        sqlSession.commit();
        sqlSession.close();

        System.out.println(user);

    }

    @Test
    public void fun3() throws IOException
    {
        String resources = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();

        User user = new User();
        user.setUsername("Selina");
        user.setBirthday(new Date(1983));
        user.setAddress("taipei");
        user.setSex("0");

        sqlSession.insert("dao.insertUserUUID",user);
        sqlSession.commit();
        sqlSession.close();

        System.out.println(user);

    }
}
