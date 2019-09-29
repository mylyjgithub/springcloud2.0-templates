package com.centerm.spring.cloud.ribbon.service.impl;

import com.centerm.spring.cloud.ribbon.service.IRibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by luyijian on 2019/9/26.
 */
@Service
public class RibbonService implements IRibbonService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloRibbonFallBack")
    public String helloRibbon(String message) {
        ResponseEntity<String> result = restTemplate.getForEntity("http://hello-service/hello?message=" + message, String.class);
        return result.getBody();
    }

    @Override
    public String helloRibbonFallBack(String message) {
        return "hi ribbon,your message is "+message+", net work error!";
    }
}
