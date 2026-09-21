package com.coolproject.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coolproject.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}