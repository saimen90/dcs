package dcs.demo.openfeign.server.service.impl;


import dcs.demo.openfeign.server.service.LoginServerService;
import org.springframework.stereotype.Service;

/**
 * @author liuxiansong
 */
@Service
public class LoginServerServiceImpl implements LoginServerService {

    @Override
    public String login(String username, String password) {
        return "server端返回：您输入的用户名：" + username + ",密码：" + password;
    }
}
