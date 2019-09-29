package com.centerm.spring.cloud.ribbon.service;

/**
 * Created by luyijian on 2019/9/26.
 */
public interface IRibbonService {
    String helloRibbon(String message);

    String helloRibbonFallBack(String message);

}
