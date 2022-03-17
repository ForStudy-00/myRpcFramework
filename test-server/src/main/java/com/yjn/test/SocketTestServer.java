package com.yjn.test;

import com.yjn.rpc.annotation.ServiceScan;
import com.yjn.rpc.serializer.CommonSerializer;
import com.yjn.rpc.transport.RpcServer;
import com.yjn.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author yjn
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
