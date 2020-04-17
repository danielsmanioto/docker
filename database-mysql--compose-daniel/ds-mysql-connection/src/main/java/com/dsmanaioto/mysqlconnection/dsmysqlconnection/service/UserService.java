package com.dsmanaioto.mysqlconnection.dsmysqlconnection.service;

import com.dsmanaioto.mysqlconnection.dsmysqlconnection.domain.User;
import com.dsmanaioto.mysqlconnection.dsmysqlconnection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public Iterable<User> findAll() {
		return repository.findAll();
	}
	
}
