package com.yjn.test;

import com.yjn.rpc.annotation.ServiceScan;
import com.yjn.rpc.serializer.CommonSerializer;
import com.yjn.rpc.transport.RpcServer;
import com.yjn.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author yjn
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
