package com.rjgc.controller;

import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.OrderFamilyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderFamilyController {

    @Autowired
    private OrderFamilyClient orderFamilyClient;

    @GetMapping("/orderFamily")
    ResBody<Map<String, Object>> selectOrderByFamilyId(@RequestParam int id) {
        return orderFamilyClient.selectOrderByFamilyId(id);
    }
}
