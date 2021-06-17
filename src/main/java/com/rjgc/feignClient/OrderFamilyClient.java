package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface OrderFamilyClient {

    @GetMapping("/orderFamily")
    ResBody<Map<String, Object>> selectOrderByFamilyId(@RequestParam int id);
}
