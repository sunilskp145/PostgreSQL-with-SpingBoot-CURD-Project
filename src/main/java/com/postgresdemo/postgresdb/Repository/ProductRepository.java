package com.postgresdemo.postgresdb.Repository;

import com.postgresdemo.postgresdb.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);

}
