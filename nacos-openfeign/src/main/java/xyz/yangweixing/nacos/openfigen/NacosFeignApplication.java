package xyz.yangweixing.nacos.openfigen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 17:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignApplication.class, args);
    }
}
