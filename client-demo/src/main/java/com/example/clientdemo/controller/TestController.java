package com.example.clientdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanlipeng
 * @date 2018/6/25
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String getTest(){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("getIn");
        return "hello world";
    }
}
