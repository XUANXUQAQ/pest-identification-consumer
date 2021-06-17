package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.entity.Family;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface FamilyClient {

    @GetMapping("/family")
    ResBody<Map<String, Object>> selectFamiliesById(@RequestParam int id);

    @GetMapping("/family/all")
    ResBody<Map<String, Object>> selectAllFamilies(@RequestParam int pageNum, @RequestParam int pageSize);

    @GetMapping("/family/name")
    ResBody<Map<String, Object>> selectFamiliesByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name);

    @PostMapping("/family/{orderId}")
    ResBody<Integer> insertFamily(@PathVariable int orderId, @RequestBody Family family);

    @PutMapping("/family")
    ResBody<Integer> updateFamily(@RequestParam int orderId, @RequestBody Family newFamily);

    @DeleteMapping("/family")
    ResBody<Integer> deleteFamilyById(@RequestParam int id);
}
