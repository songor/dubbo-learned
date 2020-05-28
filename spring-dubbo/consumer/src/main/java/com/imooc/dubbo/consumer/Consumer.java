package com.imooc.dubbo.consumer;

import com.imooc.dubbo.QuickStartService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            QuickStartService service = (QuickStartService) context.getBean("quickStartService");
            System.out.println(service.quickStart(message));
        }
    }

}
