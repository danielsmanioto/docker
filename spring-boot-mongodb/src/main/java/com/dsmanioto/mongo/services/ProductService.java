package com.dsmanioto.mongo.services;

import com.dsmanioto.mongo.commands.ProductForm;
import com.dsmanioto.mongo.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
