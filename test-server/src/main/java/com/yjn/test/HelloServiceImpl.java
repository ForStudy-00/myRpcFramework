package com.yjn.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.yjn.rpc.annotation.Service;
import com.yjn.rpc.api.HelloObject;
import com.yjn.rpc.api.HelloService;

/**
 * @author yjn
 */
@Service
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "这是Impl1方法";
    }

}
