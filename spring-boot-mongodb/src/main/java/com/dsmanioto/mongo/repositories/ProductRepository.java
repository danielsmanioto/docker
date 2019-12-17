package com.dsmanioto.mongo.repositories;

import com.dsmanioto.mongo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
