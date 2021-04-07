package dcs.demo.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuxiansong
 */
@SpringBootApplication
@EnableFeignClients
public class DcsDemoOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcsDemoOpenFeignApplication.class, args);
    }
}
