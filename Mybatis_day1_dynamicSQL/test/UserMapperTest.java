import com.reborn.mapper.UserMapper;
import com.reborn.po.UserExt;
import com.reborn.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class UserMapperTest
{
    @Test
    public void findUserInIdList() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //构造userQueryVO对象
        UserQueryVo userQueryVO = new UserQueryVo();

        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(28);
        idList.add(30);

        userQueryVO.setIdList(idList);
        List<UserExt> users = mapper.findUserInIdList(userQueryVO);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void findUserCountSql() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //构造userQueryVO对象
        UserQueryVo userQueryVO = new UserQueryVo();

        // 构造UserExt对象
        UserExt userExt = new UserExt();
        userExt.setSex("0");
        //userExt.setUsername("Selina");

        userQueryVO.setUserExt(userExt);

        // 调用mapper对象的方法
        int count = mapper.findUserCountSql(userQueryVO);

        System.out.println(count);
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void findUserListIf() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //构造userQueryVO对象
        UserQueryVo userQueryVO = new UserQueryVo();

        // 构造UserExt对象
        UserExt userExt = new UserExt();
        userExt.setSex("0");
        //userExt.setUsername("Selina");

        userQueryVO.setUserExt(userExt);

        // 调用mapper对象的方法
        List<UserExt> list = mapper.findUserListIf(userQueryVO);

        System.out.println(list);
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void findUserCountIf() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //构造userQueryVO对象
        UserQueryVo userQueryVO = new UserQueryVo();

        // 构造UserExt对象
        UserExt userExt = new UserExt();
        //userExt.setSex("0");
        userExt.setUsername("Selina");

        userQueryVO.setUserExt(userExt);

        // 调用mapper对象的方法
        int count = mapper.findUserCountIf(userQueryVO);

        System.out.println(count);
        // 关闭SqlSession
        sqlSession.close();
    }

    private SqlSessionFactory factory;
    @Before
    public void setUp() throws Exception
    {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory  = new SqlSessionFactoryBuilder().build(inputStream);
    }


}