package dcs.demo.openfeign.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuxiansong
 */
@FeignClient(name = "open-feign-server", url = "http://127.0.0.1:4561")
public interface LoginService {

    @RequestMapping(value = "/login/submit/{username}/{password}", method = RequestMethod.GET)
    String submit(@PathVariable("username") String username, @PathVariable("password") String password);
}
