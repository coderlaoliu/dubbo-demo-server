package cn.wolfcode.dubbo.service.impl;

import cn.wolfcode.dubbo.service.IUserinfoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author hox
 */
@Service
public class UserinfoServiceImpl implements IUserinfoService {

    @Override
    public void register(String username, String password) {
        System.out.println("用户注册：" + username + "\t" + password);
    }
}
