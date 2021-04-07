package dcs.demo.zookeeper.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author liuxiansong
 */
@RestController
@RequestMapping({"/zk/"})
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "zk";
    }
}
