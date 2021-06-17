package com.rjgc.controller;

import com.rjgc.entity.Species;
import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.SpeciesClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class SpeciesController {

    @Autowired
    private SpeciesClient speciesClient;

    @GetMapping("/species")
    ResBody<Map<String, Object>> selectSpeciesVoById(@RequestParam int id) {
        return speciesClient.selectSpeciesVoById(id);
    }

    @GetMapping("/species/{code}")
    ResBody<Map<String, Object>> selectSpeciesByCode(@PathVariable String code) {
        return speciesClient.selectSpeciesByCode(code);
    }

    @GetMapping("/species/name")
    ResBody<Map<String, Object>> selectSpeciesByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name) {
        return speciesClient.selectSpeciesByName(pageNum, pageSize, name);
    }

    @GetMapping("species/all")
    ResBody<Map<String, Object>> selectAllSpecies(@RequestParam int pageNum, @RequestParam int pageSize) {
        return speciesClient.selectAllSpecies(pageNum, pageSize);
    }

    @PostMapping("/species")
    ResBody<Integer> insertSpecies(@RequestBody Species species) {
        return speciesClient.insertSpecies(species);
    }

    @DeleteMapping("/species")
    ResBody<Integer> deleteSpecieSsById(@RequestParam int id) {
        return speciesClient.deleteSpecieSsById(id);
    }

    @PutMapping("/species")
    ResBody<Integer> updateSpecies(@RequestBody Species species) {
        return speciesClient.updateSpecies(species);
    }
}
