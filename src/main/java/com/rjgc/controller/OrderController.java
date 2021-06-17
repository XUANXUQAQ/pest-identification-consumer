package com.rjgc.controller;

import com.rjgc.entity.Orders;
import com.rjgc.exceptions.ResBody;
import com.rjgc.feignClient.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderClient orderClient;

    @GetMapping("/order/all")
    ResBody<Map<String, Object>> selectAllOrders(@RequestParam int pageNum, @RequestParam int pageSize) {
        return orderClient.selectAllOrders(pageNum, pageSize);
    }

    @GetMapping("/order/name")
    ResBody<Map<String, Object>> selectOrdersByName(@RequestParam int pageNum, @RequestParam int pageSize, @RequestParam String name) {
        return orderClient.selectOrdersByName(pageNum, pageSize, name);
    }

    @GetMapping("/order")
    ResBody<Map<String, Object>> selectOrderById(@RequestParam int id) {
        return orderClient.selectOrderById(id);
    }

    @PostMapping("/order")
    ResBody<Integer> insertOrder(@RequestBody Orders orders) {
        return orderClient.insertOrder(orders);
    }

    @DeleteMapping("/order")
    ResBody<Integer> deleteOrderById(@RequestParam int id) {
        return orderClient.deleteOrderById(id);
    }

    @PutMapping("/order")
    ResBody<Integer> updateOrder(@RequestBody Orders newOrders) {
        return orderClient.updateOrder(newOrders);
    }
}
