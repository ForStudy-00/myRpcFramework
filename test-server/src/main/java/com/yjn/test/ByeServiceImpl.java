package com.yjn.test;

import com.yjn.rpc.annotation.Service;
import com.yjn.rpc.api.ByeService;

/**
 * @author yjn
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
