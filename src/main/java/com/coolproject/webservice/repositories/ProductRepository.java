package com.coolproject.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coolproject.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}