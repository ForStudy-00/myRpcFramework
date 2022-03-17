package com.yjn.rpc.provider;

/**
 * 保存和提供服务实例对象
 * @author yjn
 */
public interface ServiceProvider {


    <T> void addServiceProvider(T service, String serviceName);

    Object getServiceProvider(String serviceName);

}
