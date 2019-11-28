package xyz.yangweixing.nacos.openfigen.service.impl;

import org.springframework.stereotype.Component;
import xyz.yangweixing.nacos.openfigen.service.FeignService;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 18:23
 */
@Component
public class FallBackServiceImpl implements FeignService {

    @Override
    public String test(String message) {
        return "test fallback";
    }
}
