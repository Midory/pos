package com.techdemo.pos.repository;

import com.techdemo.pos.model.referential.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, UUID> {

    Optional<ProductPrice> findByProductIdAndStoreId(UUID productId, UUID storeId);

    @Query("select pr from ProductPrice pr " +
            "where product.id = :productId " +
            "and store.id = :storeId " +
            "and active = true")
    Optional<ProductPrice> findByProductIdAndStoreIdAndIsActive(@Param("productId") UUID productId, @Param("storeId") UUID storeId);

}
