package alone.aa.test;

import alone.aa.User;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJPA {
    @Test
    public void test1(){
        /**
         * 创建实体管理类工厂，借助Persistence的静态方法获取
         * 		其中传递的参数为持久化单元名称，需要jpa配置文件中指定
         */
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("myJpa");
        //创建实体管理类
        EntityManager em=factory.createEntityManager();
        //获取事务对象
        EntityTransaction transaction=em.getTransaction();
        //开启事务
        transaction.begin();
        //
        User user = new User();
        user.setName("李白");
        user.setPwd("1234");

        //保存  persist持续
        em.persist(user);
        //提交事务
        transaction.commit();
        //释放资源
        em.close();
        factory.close();
    }
}
