package team.arryn.chapter4.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import team.arryn.chapter4.servicefeign.service.impl.SchedualHelloServiceImpl;

@FeignClient(value = "service-hi",fallback = SchedualHelloServiceImpl.class)  //@ FeignClient（“服务名”），来指定调用哪个服务
public interface SchedualHelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
