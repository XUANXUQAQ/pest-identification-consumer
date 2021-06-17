package com.rjgc.controller;

import com.rjgc.entity.Family;
import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.FamilyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FamilyController {

    @Autowired
    private FamilyClient familyClient;

    @GetMapping("/family")
    ResBody<Map<String, Object>> selectFamiliesById(@RequestParam int id) {
        return familyClient.selectFamiliesById(id);
    }

    @GetMapping("/family/all")
    ResBody<Map<String, Object>> selectAllFamilies(@RequestParam int pageNum, @RequestParam int pageSize) {
        return familyClient.selectAllFamilies(pageNum, pageSize);
    }

    @GetMapping("/family/name")
    ResBody<Map<String, Object>> selectFamiliesByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name) {
        return familyClient.selectFamiliesByName(pageNum, pageSize, name);
    }

    @PostMapping("/family/{orderId}")
    ResBody<Integer> insertFamily(@PathVariable int orderId, @RequestBody Family family) {
        return familyClient.insertFamily(orderId, family);
    }

    @PutMapping("/family")
    ResBody<Integer> updateFamily(@RequestParam int orderId, @RequestBody Family newFamily) {
        return familyClient.updateFamily(orderId, newFamily);
    }

    @DeleteMapping("/family")
    ResBody<Integer> deleteFamilyById(@RequestParam int id) {
        return familyClient.deleteFamilyById(id);
    }
}
