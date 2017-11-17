package APITest;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.User;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/5.
 * 使用session对数据库进行增删改查
 */
public class ManipulateDB {
    private Session session = HibernateUtils.getSession();

    @Test
    public void addUser()
    {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");
        session.save(user);
        session.close();
    }

    @Test
    public void deteleUser()
    {
        Transaction transaction = session.beginTransaction();
        User user = (User) session.get(User.class,1);
        session.delete(user);
        transaction.commit();
    }

    @Test
    public void update()
    {
        Transaction transaction = session.beginTransaction();
        User user = (User) session.get(User.class,2);
        user.setUsername("ella");
        session.update(user);
        transaction.commit();
        session.close();
    }

    @Test
    public void query()
    {
        //根据主键查询某一行
        //get立即查询
        User user = (User) session.get(User.class,3);
        System.out.println(user);

        //load:lazy loading的效果，先不查只返回代理对象，使用属性时才真的去数据库查，只查一次
        User user1 = (User) session.load(User.class,3);
        System.out.println(user1);

        //查询所有行select * from t_user
        //Query---->HQL
        Query query = session.createQuery("from User");
        List<User> userList = query.list();
        System.out.println(userList);

        //Criteria
        Criteria criteria = session.createCriteria(User.class);
        List<User> userList1 = criteria.list();
        System.out.println(userList1);

        //SQLQuery
        SQLQuery sqlQuery = session.createSQLQuery("SELECT * from t_user");
        sqlQuery.addEntity(User.class);
        List<User> userList2 = sqlQuery.list();
        System.out.println(userList2);
    }

    @Test
    public void queryQuery()
    {
        //条件查询，分页查询
        Query query = session.createQuery("from User  where username='hebe'");
        User user = (User) query.uniqueResult();
        System.out.println(user);


        Query query1 = session.createQuery("from User");
        query1.setFirstResult(0);
        query1.setMaxResults(2);
        List<User> userList = query1.list();
        System.out.println(userList);
    }

    @Test
    public void queryCriteria()
    {
        Criteria criteria = session.createCriteria(User.class);
        User user = (User) criteria.add(Restrictions.eq("username","selina")).uniqueResult();
        List<User> user1 = criteria.add(Restrictions.gt("id",3)).list();
        List<User> user2 = criteria.add(Restrictions.like("username","%e%")).list();
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
    }


}
