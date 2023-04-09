package com.hillel.spring_boot.service;

import com.hillel.spring_boot.entity.Order;
import com.hillel.spring_boot.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {

    private  final  OrderRepository orderRepository;

    public Order getById(Long id) {
        log.info("searching order by id " + id);
        return orderRepository.findById(id).orElseThrow(()-> new RuntimeException("Order not found by id " + id));
    }
    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }
}
