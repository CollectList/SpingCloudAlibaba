package xyz.yangweixing.nacos.openfigen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.yangweixing.nacos.openfigen.service.impl.FallBackServiceImpl;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/28 18:01
 */
@FeignClient(value = "nacos-discovery-provider", fallback = FallBackServiceImpl.class)
public interface FeignService {

    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);
}
