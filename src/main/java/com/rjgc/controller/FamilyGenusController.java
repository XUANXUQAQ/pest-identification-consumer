package com.rjgc.controller;

import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.FamilyGenusClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FamilyGenusController {

    @Autowired
    private FamilyGenusClient familyGenusClient;

    @GetMapping("/familyGenus")
    ResBody<Map<String, Object>> selectFamilyByGenusId(@RequestParam int id) {
        return familyGenusClient.selectFamilyByGenusId(id);
    }
}
