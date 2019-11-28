package xyz.yangweixing.nacos.discovery.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 18:06
 */
@RestController
public class NacosProviderController {

    @GetMapping(value = "/test/{message}")
    public String test(@PathVariable("message") String message) {
        return "Hello " + message;
    }

}
