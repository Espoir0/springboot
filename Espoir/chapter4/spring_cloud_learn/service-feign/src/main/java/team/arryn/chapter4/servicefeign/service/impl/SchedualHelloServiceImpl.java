package team.arryn.chapter4.servicefeign.service.impl;

import org.springframework.stereotype.Component;
import team.arryn.chapter4.servicefeign.service.SchedualHelloService;

@Component
public class SchedualHelloServiceImpl implements SchedualHelloService{
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}
