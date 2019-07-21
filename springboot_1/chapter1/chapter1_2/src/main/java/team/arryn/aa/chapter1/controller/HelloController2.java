package team.arryn.aa.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @Autowired
    private Environment env;
    @RequestMapping("seeMessageConfig2")
    public String seeMessage(){
        return env.getProperty("message");
    }
    @RequestMapping("seeGroupConfig2")
    public String seeGroup(){
        return env.getProperty("group");
    }@RequestMapping("seeCreaterConfig2")
    public String seeCreater(){
        return env.getProperty("create");
    }
}
