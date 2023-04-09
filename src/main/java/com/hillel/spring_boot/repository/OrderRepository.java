package com.hillel.spring_boot.repository;

import com.hillel.spring_boot.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
