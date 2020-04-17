package com.dsmanaioto.mysqlconnection.dsmysqlconnection;

import com.dsmanaioto.mysqlconnection.dsmysqlconnection.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DsMysqlConnectionApplicationTests {
	
	@Autowired
	private UserService service;
	
	@Test
	void findAllUsers() {
		service.findAll();
	}
	
}
