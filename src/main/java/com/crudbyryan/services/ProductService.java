package com.crudbyryan.services;

import com.crudbyryan.entities.Product;

/**
 * Created by Ryan Bagus Susilo on 1/26/2017.
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
