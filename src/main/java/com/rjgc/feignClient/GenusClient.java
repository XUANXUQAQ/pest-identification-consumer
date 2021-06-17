package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.entity.Genus;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface GenusClient {

    @GetMapping("/genus/all")
    ResBody<Map<String, Object>> selectAllGenus(@RequestParam int pageNum, @RequestParam int pageSize);

    @GetMapping("/genus/name")
    ResBody<Map<String, Object>> selectGenusByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name);

    @GetMapping("/genus")
    ResBody<Map<String, Object>> selectGenusById(@RequestParam int id);

    @PostMapping("/genus/{familyId}")
    ResBody<Integer> insertGenus(@PathVariable int familyId, @RequestBody Genus genus);

    @DeleteMapping("/genus")
    ResBody<Integer> deleteGenusById(@RequestParam int id);

    @PutMapping("/genus")
    ResBody<Integer> updateGenus(@RequestParam int familyId, @RequestBody Genus newGenus);
}
