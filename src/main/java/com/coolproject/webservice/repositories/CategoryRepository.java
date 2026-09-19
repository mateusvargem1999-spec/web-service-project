package com.coolproject.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coolproject.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}