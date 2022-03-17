package com.yjn.test;

import com.yjn.rpc.api.ByeService;
import com.yjn.rpc.api.HelloObject;
import com.yjn.rpc.api.HelloService;
import com.yjn.rpc.serializer.CommonSerializer;
import com.yjn.rpc.transport.RpcClient;
import com.yjn.rpc.transport.RpcClientProxy;
import com.yjn.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author yjn
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
