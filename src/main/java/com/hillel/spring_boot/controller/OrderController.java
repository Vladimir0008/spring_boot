package com.hillel.spring_boot.controller;

import com.hillel.spring_boot.entity.Order;
import com.hillel.spring_boot.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @GetMapping("{id}")
    public Order getById(@PathVariable Long id) {
       return orderService.getById(id);
    }

    @GetMapping("/all")
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
