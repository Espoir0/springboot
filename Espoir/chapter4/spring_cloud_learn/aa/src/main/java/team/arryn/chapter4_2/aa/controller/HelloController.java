package team.arryn.chapter4_2.aa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.arryn.chapter4_2.aa.service.HelloService;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return service.hiService(name);
    }
}
