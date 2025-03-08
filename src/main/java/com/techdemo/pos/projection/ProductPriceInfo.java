package com.techdemo.pos.projection;

import com.techdemo.pos.model.referential.ProductPrice;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Projection for {@link ProductPrice}
 */
public interface ProductPriceInfo {
    UUID getId();

    BigDecimal getPrice();

    String getCurrency();

    ProductInfo getProduct();
}