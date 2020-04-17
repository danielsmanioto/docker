package com.dsmanaioto.mysqlconnection.dsmysqlconnection.resource;

import com.dsmanaioto.mysqlconnection.dsmysqlconnection.domain.User;
import com.dsmanaioto.mysqlconnection.dsmysqlconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@GetMapping
	public Iterable<User> getAllUsers() {
		return service.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Optional<User> user = service.findById(id);
		if (user.isPresent()) {
			service.delete(user.get());
		}
	}
	
}
