package com.rjgc.controller;

import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.LoginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginClient loginClient;

    @PostMapping(value = "/login")
    ResBody<Map<String, Object>> login(@RequestParam String username, @RequestParam String password) {
        return loginClient.login(username, password);
    }
}
