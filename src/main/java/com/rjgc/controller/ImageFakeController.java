package com.rjgc.controller;

import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.ImageFakeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageFakeController {
    @Autowired
    private ImageFakeClient imageFakeClient;

    @GetMapping("/imgFake")
    ResBody<String> uploadImg() {
        return imageFakeClient.uploadImg();
    }
}
