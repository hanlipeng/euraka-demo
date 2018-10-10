package com.example.clientfeigndemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hanlipeng
 * @date 2018/6/25
 */
@FeignClient("client-test")
public interface FeignService {
    @GetMapping("test")
    String getTest();
}
