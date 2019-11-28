package xyz.yangweixing.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 15:54
 */
@RefreshScope
public class SampleController {

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int age;
}
