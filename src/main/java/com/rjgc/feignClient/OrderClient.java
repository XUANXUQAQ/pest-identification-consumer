package com.rjgc.feignClient;

import com.rjgc.config.FeignConfig;
import com.rjgc.entity.Orders;
import com.rjgc.exceptions.ResBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "pest-identification-provider", configuration = FeignConfig.class)
public interface OrderClient {

    @GetMapping("/order/all")
    ResBody<Map<String, Object>> selectAllOrders(@RequestParam int pageNum, @RequestParam int pageSize);

    @GetMapping("/order/name")
    ResBody<Map<String, Object>> selectOrdersByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name);

    @GetMapping("/order")
    ResBody<Map<String, Object>> selectOrderById(@RequestParam int id);

    @PostMapping("/order")
    ResBody<Integer> insertOrder(@RequestBody Orders orders);

    @DeleteMapping("/order")
    ResBody<Integer> deleteOrderById(@RequestParam int id);

    @PutMapping("/order")
    ResBody<Integer> updateOrder(@RequestBody Orders newOrders);
}
