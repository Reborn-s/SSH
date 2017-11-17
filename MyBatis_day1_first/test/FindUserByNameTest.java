import com.reborn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class FindUserByNameTest
{
    @Test
    public void test() throws IOException
    {
        String resouce = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = factory.openSession();
        List<User> users = sqlSession.selectList("dao.findUserByName", "小明");
        System.out.println(users);
        sqlSession.close();
    }
}
