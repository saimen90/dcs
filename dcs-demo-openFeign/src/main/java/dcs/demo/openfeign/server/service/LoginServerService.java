package dcs.demo.openfeign.server.service;

/**
 * @author liuxiansong
 */
public interface LoginServerService {

    /**
     * 模拟登录
     *
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

}
