package com.techdemo.pos.repository;

import com.techdemo.pos.model.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaleRepository extends JpaRepository<Sale, UUID> {
}