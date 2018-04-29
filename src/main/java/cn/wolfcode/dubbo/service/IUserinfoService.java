package cn.wolfcode.dubbo.service;

/**
 * @author hox
 */
public interface IUserinfoService {

    /**
     * 注册接口
     *
     * @param username
     * @param password
     */
    void register(String username, String password);
}
