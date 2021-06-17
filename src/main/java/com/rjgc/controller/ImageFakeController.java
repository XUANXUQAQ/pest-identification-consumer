package com.rjgc.controller;

import com.rjgc.exceptions.ResBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageFakeController {

    @GetMapping("/imgFake")
    ResBody<String> uploadImg() {
        ResBody<String> rb = new ResBody<>();
        rb.setCode(20000);
        rb.setMessage("成功");
        rb.setResult(null);
        return rb;
    }
}
