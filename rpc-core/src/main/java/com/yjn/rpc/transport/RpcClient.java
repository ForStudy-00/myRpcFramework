package com.yjn.rpc.transport;

import com.yjn.rpc.entity.RpcRequest;
import com.yjn.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author yjn
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
