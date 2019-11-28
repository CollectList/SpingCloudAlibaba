package xyz.yangweixing.nacos.openfigen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yangweixing.nacos.openfigen.service.FeignService;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 18:01
 */
@SuppressWarnings("ALL")
@RestController
public class NacosFeignController {

    @Autowired
    public FeignService feignService;

    @GetMapping(value = "/test")
    public String test() {
        return feignService.test("feign");
    }
}
