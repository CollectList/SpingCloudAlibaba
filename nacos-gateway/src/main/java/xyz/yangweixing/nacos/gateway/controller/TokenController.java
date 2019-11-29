package xyz.yangweixing.nacos.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.yangweixing.nacos.gateway.filter.JwtUtil;

@RestController
public class TokenController {

    @GetMapping("/getToken/{name}")
    public String get(@PathVariable("name") String name) {
        return JwtUtil.generateToken(name);
    }

}
