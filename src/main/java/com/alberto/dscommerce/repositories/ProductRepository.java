package com.alberto.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    

}
