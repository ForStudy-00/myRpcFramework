package com.yjn.rpc.exception;

/**
 * 序列化异常
 *
 * @author yjn
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
