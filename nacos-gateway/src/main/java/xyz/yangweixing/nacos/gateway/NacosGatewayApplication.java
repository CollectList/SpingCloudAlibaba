package xyz.yangweixing.nacos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/29 9:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosGatewayApplication {

    public static void main(String[] args){
        SpringApplication.run(NacosGatewayApplication.class, args);
    }
}
