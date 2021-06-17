package com.rjgc.feignClient;

import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "pest-identification-provider")
public interface LoginClient {

    @PostMapping(value = "/login")
    ResBody<Map<String, Object>> login(@RequestParam String username, @RequestParam String password);
}
