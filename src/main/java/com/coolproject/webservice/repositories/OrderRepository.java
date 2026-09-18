package com.coolproject.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coolproject.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}