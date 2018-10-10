package com.example.clientfeigndemo.controller;

import com.example.clientfeigndemo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanlipeng
 * @date 2018/6/25
 */
@RestController
public class TestFeign {
    @Autowired
    private FeignService feignService;
    @GetMapping("test")
    public Object testFeign(){
        return feignService.getTest();
    }

}
