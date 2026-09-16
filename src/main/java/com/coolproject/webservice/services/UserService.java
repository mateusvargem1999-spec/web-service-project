package com.coolproject.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolproject.webservice.entities.User;
import com.coolproject.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User FindById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}