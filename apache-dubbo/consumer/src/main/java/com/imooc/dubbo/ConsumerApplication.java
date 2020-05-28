package com.imooc.dubbo;

import com.imooc.dubbo.consumer.QuickStartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        QuickStartConsumer consumer = (QuickStartConsumer) context.getBean("quickStartConsumer");
        consumer.sendMessage("MESSAGE");
    }

}
