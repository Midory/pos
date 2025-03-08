package com.techdemo.pos.repository;

import com.techdemo.pos.model.referential.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Optional<Product> findByBarcode(String barCode);

}
