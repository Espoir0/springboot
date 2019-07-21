package team.arryn.aa.chapter3.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * jdbc工具类
 */
public class JDBCUtils {
    //定义数据源
    private static DataSource ds;
    static {
        //加载配置文件
        Properties pro = new Properties();
        InputStream is=JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            //获取数据源
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static DataSource getDataSourse(){
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
