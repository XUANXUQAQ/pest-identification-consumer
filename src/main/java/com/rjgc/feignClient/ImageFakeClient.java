package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface ImageFakeClient {

    @GetMapping("/imgFake")
    ResBody<String> uploadImg();
}
