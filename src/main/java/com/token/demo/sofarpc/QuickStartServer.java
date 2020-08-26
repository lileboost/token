package com.token.demo.sofarpc;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import com.token.demo.sofarpc.HelloService;
import com.token.demo.sofarpc.HelloServiceImpl;

/**
 * @title: QuickStartServer
 * @projectName token
 * @description: TODO
 * @author lile
 * @date 2020/8/1015:51
 */
public class QuickStartServer {
    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                //蚂蚁内部使用的通讯协议是Bolt，序列化协议是Hessian
                .setProtocol("bolt") // 设置一个协议，默认bolt;
                .setPort(9696) // 设置一个端口，默认12200
                .setDaemon(false); // 非守护线程

        ProviderConfig<HelloService> providerConfig = new ProviderConfig<HelloService>()
                .setInterfaceId(HelloService.class.getName()) // 指定接口
                .setRef(new HelloServiceImpl()) // 指定实现
                .setServer(serverConfig); // 指定服务端

        providerConfig.export(); // 发布服务
    }
}