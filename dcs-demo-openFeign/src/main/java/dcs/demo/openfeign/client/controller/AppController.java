package dcs.demo.openfeign.client.controller;

import dcs.demo.openfeign.client.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiansong
 */
@RestController
@RequestMapping({"/app/"})
public class AppController {

    @Autowired
    LoginService loginService;

    @GetMapping("/test")
    public String test() {
        return "/app/test";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("远程调用");
        return loginService.submit("张三","123456");
    }

}
