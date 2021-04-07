package dcs.demo.redisson.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiansong
 */

@RestController
@RequestMapping({"/api/"})

public class IndexController {


    @GetMapping("/index")
    public String index() {
        return "redisson，test";
    }
}
