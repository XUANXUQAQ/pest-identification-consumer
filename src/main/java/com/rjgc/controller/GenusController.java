package com.rjgc.controller;

import com.rjgc.entity.Genus;
import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.GenusClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GenusController {

    @Autowired
    private GenusClient genusClient;

    @GetMapping("/genus/all")
    ResBody<Map<String, Object>> selectAllGenus(@RequestParam int pageNum, @RequestParam int pageSize) {
        return genusClient.selectAllGenus(pageNum, pageSize);
    }

    @GetMapping("/genus/name")
    ResBody<Map<String, Object>> selectGenusByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name) {
        return genusClient.selectGenusByName(pageNum, pageSize, name);
    }

    @GetMapping("/genus")
    ResBody<Map<String, Object>> selectGenusById(@RequestParam int id) {
        return genusClient.selectGenusById(id);
    }

    @PostMapping("/genus/{familyId}")
    ResBody<Integer> insertGenus(@PathVariable int familyId, @RequestBody Genus genus) {
        return genusClient.insertGenus(familyId, genus);
    }

    @DeleteMapping("/genus")
    ResBody<Integer> deleteGenusById(@RequestParam int id) {
        return genusClient.deleteGenusById(id);
    }

    @PutMapping("/genus")
    ResBody<Integer> updateGenus(@RequestParam int familyId, @RequestBody Genus newGenus) {
        return genusClient.updateGenus(familyId, newGenus);
    }
}
