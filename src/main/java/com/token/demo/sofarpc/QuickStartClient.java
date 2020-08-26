package com.token.demo.sofarpc;

import com.alipay.sofa.rpc.config.ConsumerConfig;
import com.token.demo.sofarpc.HelloService;

/**
 * @title: QuickStartClient
 * @projectName token
 * @description: TODO
 * @author lile
 * @date 2020/8/10 15:52
 */
public class QuickStartClient {
    public static void main(String[] args) {
        ConsumerConfig<HelloService> consumerConfig = new ConsumerConfig<HelloService>()
                .setInterfaceId(HelloService.class.getName()) // 指定接口
                .setProtocol("bolt") // 指定协议
                .setDirectUrl("bolt://127.0.0.1:9696"); // 指定直连地址

        HelloService helloService = consumerConfig.refer();

        while (true) {
            System.out.println(helloService.sayHello("world"));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}