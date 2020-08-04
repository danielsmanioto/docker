package com.dsmanaioto.mysqlconnection.dsmysqlconnection.service;

import com.dsmanaioto.mysqlconnection.dsmysqlconnection.domain.User;
import com.dsmanaioto.mysqlconnection.dsmysqlconnection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public Iterable<User> findAll() {
		return repository.findAll();
	}
	
	public void deleteById(long id) {
		repository.deleteById(id);
	}
	
	public Optional<User> findById(long id) {
		return repository.findById(id);
	}
	
	public void delete(User user) {
		repository.delete(user);
	}
	
}
