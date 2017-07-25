package com.ssm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这是一个基于注解的控制器
 * 可以同时处理多个接口，并且不需要实现任何接口
 * org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class HelloControllerAnnotation {
    private static final Log logger = LogFactory.getLog(HelloControllerAnnotation.class);
    /**
     * org.springframework.web.bind.annotation.RequestMapping注解
     * 用来映射请求的URL和请求的方法等。
     * 该方法返回一个包含视图或视图名和模型的ModelAndView对象
     */
    @RequestMapping(value="/helloAnnotation")
    public ModelAndView helloAnnotation(){
        logger.info("helloAnnotation方法被调用");
        //创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象
        mv.addObject("message","hello world");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图里
        mv.setViewName("welcome");
        return mv;
    }
}
