package dcs.demo.openfeign.server.controller;


import dcs.demo.openfeign.server.service.LoginServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiansong
 */
@RestController
@RequestMapping({"/login/"})
public class LoginController {


    @Autowired
    LoginServerService loginServerService;


    @GetMapping("/submit/{username}/{password}")
    public String submit(@PathVariable("username") String username, @PathVariable("password") String password) {
        return loginServerService.login(username, password);
    }

}
