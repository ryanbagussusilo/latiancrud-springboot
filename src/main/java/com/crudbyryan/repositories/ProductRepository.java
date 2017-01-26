package com.crudbyryan.repositories;

import com.crudbyryan.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ryan Bagus Susilo on 1/26/2017.
 */
public interface ProductRepository extends CrudRepository<Product,Integer>{
}
