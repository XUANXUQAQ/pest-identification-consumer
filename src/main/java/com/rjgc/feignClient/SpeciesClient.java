package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.entity.Species;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface SpeciesClient {

    @GetMapping("/species")
    ResBody<Map<String, Object>> selectSpeciesVoById(@RequestParam int id);

    @GetMapping("/species/{code}")
    ResBody<Map<String, Object>> selectSpeciesByCode(@PathVariable String code);

    @GetMapping("/species/name")
    ResBody<Map<String, Object>> selectSpeciesByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name);

    @GetMapping("species/all")
    ResBody<Map<String, Object>> selectAllSpecies(@RequestParam int pageNum, @RequestParam int pageSize);

    @PostMapping("/species")
    ResBody<Integer> insertSpecies(@RequestBody Species species);

    @DeleteMapping("/species")
    ResBody<Integer> deleteSpecieSsById(@RequestParam int id);

    @PutMapping("/species")
    ResBody<Integer> updateSpecies(@RequestBody Species species);
}
