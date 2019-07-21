package team.arryn.aa.chapter3.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    //使用lombok 自动配置
    //private static final org.slf4j.Logger log=org.slf4j.LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     *统一异常处理，程序中发生名为Exception的异常时，被该方法捕获
     * 返回自定义的结果集对象
     *
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        //log.debug("this is debug log:");
        //log.info("this is info log:");
        //log.error("系统异常",e);
        return new Result(0,"系统异常");
    }
}
