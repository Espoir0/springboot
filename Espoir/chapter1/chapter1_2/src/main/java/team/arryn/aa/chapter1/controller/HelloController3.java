package team.arryn.aa.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
public class HelloController3 {

    //使用Properties读取配置文件
    @RequestMapping("seeMessageConfig3")
    public String seeMessage(){

        InputStream is=HelloController3.class.getClassLoader().getResourceAsStream("application.properties");
        Properties pro = new Properties();
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro.getProperty("message");
    }
}
