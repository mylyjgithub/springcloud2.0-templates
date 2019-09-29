package com.centerm.spring.cloud.feign.service;

import com.centerm.spring.cloud.feign.service.impl.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by luyijian on 2019/9/26.
 */
@FeignClient(value = "hello-service",fallback = FeignFallback.class)
public interface IFeignService {

    @GetMapping("/hello")
    String helloFeign(@RequestParam("message") String message);

}
