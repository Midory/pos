package com.techdemo.pos.projection;

import com.techdemo.pos.model.referential.Product;

import java.util.UUID;

/**
 * Projection for {@link Product}
 */
public interface ProductInfo {
    UUID getId();

    String getCode();

    String getDescription();

    String getBarCode();
}