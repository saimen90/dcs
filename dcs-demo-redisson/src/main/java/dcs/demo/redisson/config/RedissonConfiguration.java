package dcs.demo.redisson.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

/**
 * @author liuxiansong
 */
@Configuration
public class RedissonConfiguration {

    @Bean
    public RedissonClient redissonClient() throws IOException {
        // 单Redis节点模式 // 默认连接地址 127.0.0.1:6379
       RedissonClient redisson = Redisson.create();
        return redisson;

      /*  // 通过YAML文件配置
        String configFile = this.getClass().getClassLoader().getResource("config-file.yaml").getPath();
        Config config = Config.fromYAML(new File(configFile));
        RedissonClient redisson = Redisson.create(config);
        return redisson;*/
    }
}
