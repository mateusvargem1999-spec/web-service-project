package com.coolproject.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coolproject.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}