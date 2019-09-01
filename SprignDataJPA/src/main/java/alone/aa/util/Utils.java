package alone.aa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utils {
    // JPA的实体管理器工
    private static EntityManagerFactory factory=null;

    static {
        factory = Persistence.createEntityManagerFactory("myJpa");
    }

    //使用工厂创建对象
    public static EntityManager getEntityManeger(){
        return factory.createEntityManager();
    }
}
