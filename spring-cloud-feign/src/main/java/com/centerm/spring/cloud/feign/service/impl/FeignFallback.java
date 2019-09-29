package com.centerm.spring.cloud.feign.service.impl;

import com.centerm.spring.cloud.feign.service.IFeignService;
import org.springframework.stereotype.Component;

/**
 * Created by luyijian on 2019/9/26.
 */
@Component
public class FeignFallback implements IFeignService{

    @Override
    public String helloFeign(String message) {
        return "hello-service is error";
    }
}
