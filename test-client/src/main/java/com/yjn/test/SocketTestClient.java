package com.yjn.test;

import com.yjn.rpc.api.ByeService;
import com.yjn.rpc.api.HelloObject;
import com.yjn.rpc.api.HelloService;
import com.yjn.rpc.serializer.CommonSerializer;
import com.yjn.rpc.transport.RpcClientProxy;
import com.yjn.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 *
 * @author yjn
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
