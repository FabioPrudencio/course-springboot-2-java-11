package com.ornitorrincosystems.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ornitorrincosystems.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
