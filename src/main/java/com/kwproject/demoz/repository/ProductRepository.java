package com.kwproject.demoz.repository;

import com.kwproject.demoz.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
