package team.arryn.aa.chapter1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message}")
    private String msg;
    @Value("${group}")
    private String group;
    @Value("${create}")
    private String creater;

    @RequestMapping("seeMessageConfig")
    public String seeMessage(){
        return msg;
    }
    @RequestMapping("seeGroupConfig")
    public String seeGroup(){
        return group;
    }
    @RequestMapping("seeCreaterConfig")
    public String seeCreater(){
        return creater;
    }
}
