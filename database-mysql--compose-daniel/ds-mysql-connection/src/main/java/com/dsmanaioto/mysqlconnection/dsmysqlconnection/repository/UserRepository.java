package com.dsmanaioto.mysqlconnection.dsmysqlconnection.repository;

import com.dsmanaioto.mysqlconnection.dsmysqlconnection.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
