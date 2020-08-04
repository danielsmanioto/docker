package com.dsmanioto.services;

import com.dsmanioto.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
