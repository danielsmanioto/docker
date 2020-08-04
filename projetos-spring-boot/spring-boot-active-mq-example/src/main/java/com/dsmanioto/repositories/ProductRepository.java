package com.dsmanioto.repositories;

import com.dsmanioto.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
