import com.reborn.mapper.OrdersMapper;
import com.reborn.po.OrdersExt;
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
public class OrdersMapperTest
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
    public void findOrdersAndOrderdetailRstMap() throws Exception
    {
        SqlSession sqlSession = factory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> ordersUser = ordersMapper.findOrdersAndOrderdetailRstMap();
        System.out.println(ordersUser);
        sqlSession.close();
    }

}