package com.techdemo.pos.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;
import java.util.UUID;

public class SaleItemDTO {


    private UUID id;

    @NotNull
    private UUID productId;

    @NotNull
    private String productCode;

    @NotNull
    private String productName;

    @NotNull
    @PositiveOrZero
    private BigDecimal price;

    @NotNull
    @Positive
    private BigDecimal vat;

    @NotNull
    @Positive
    private BigDecimal priceWithTaxes;

    @NotNull
    private String currency;

    @NotNull
    @Positive
    private Integer quantity;

    private BigDecimal discountPercentage;
    private BigDecimal rebate;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalExcludingTaxesBeforeDiscount;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalIncludingTaxesBeforeDiscount;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalExcludingTaxesAfterDiscount;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalIncludingTaxesAfterDiscount;
}
