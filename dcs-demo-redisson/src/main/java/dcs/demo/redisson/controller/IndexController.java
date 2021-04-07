package dcs.demo.redisson.controller;


import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author liuxiansong
 */

@RestController
@RequestMapping({"/api/"})

public class IndexController {

    @Autowired
    private RedissonClient redissonClient;

    public int i = 1;

    @GetMapping("/redisson")
    public String redisson() {
        // 开始时间
        long timeInMillisStart = Calendar.getInstance().getTimeInMillis();

        RLock lock = redissonClient.getLock("lock");
        lock.lock(5, TimeUnit.SECONDS);
        if (lock.isLocked()) {
            System.out.println("计算：：" + i++);
            lock.unlock();
        }

        // 结束时间
        long timeInMillisEnd = Calendar.getInstance().getTimeInMillis();
        System.out.println(timeInMillisEnd - timeInMillisStart);
        return "测试redisson方式加锁";
    }


    @GetMapping("/index")
    public String index() {
        // 开始时间
        long timeInMillisStart = Calendar.getInstance().getTimeInMillis();
        synchronized (this) {
            System.out.println("计算：：" + i++);
        }
        // 结束时间
        long timeInMillisEnd = Calendar.getInstance().getTimeInMillis();
        System.out.println(timeInMillisEnd - timeInMillisStart);
        return "测试synchronized方式加锁";
    }
}
