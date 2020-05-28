package com.imooc.dubbo.consumer;

import com.imooc.dubbo.QuickStartService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {

    @Reference(interfaceClass = QuickStartService.class)
    private QuickStartService service;

    public void sendMessage(String message) {
        System.out.println(service.quickStart(message));
    }

}
