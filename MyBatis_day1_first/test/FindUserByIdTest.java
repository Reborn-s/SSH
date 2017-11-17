import com.reborn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class FindUserByIdTest
{
    @Test
    public void findUserByIdTest() throws IOException
    {
        //读取配置文件
        String resources = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);

        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("dao.findUserById", 1);
        System.out.println(user);
    }
}
