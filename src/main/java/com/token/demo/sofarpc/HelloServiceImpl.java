package com.token.demo.sofarpc;

import com.token.demo.sofarpc.HelloService;

/**
 * @title: HelloServiceImpl
 * @projectName token
 * @description: TODO
 * @author lile
 * @date 2020/8/10 15:49
 */


public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}
