package com.centerm.spring.cloud.feign.controller;

import com.centerm.spring.cloud.feign.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luyijian on 2019/9/26.
 */
@RestController
public class FeignController {

    @Autowired
    private IFeignService feignService;

    @GetMapping("/hello")
    public String helloRibbon(String message) {
        return feignService.helloFeign("feign "+message);
    }
}
