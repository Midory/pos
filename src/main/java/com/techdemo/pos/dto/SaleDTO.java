package com.techdemo.pos.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;


@Data
public class SaleDTO {


    private Long id;

    @PastOrPresent
    private OffsetDateTime date;

    @NotNull
    private UUID storeId;

    @NotBlank
    private String storeName;

    @NotBlank
    private String storeAddress;

    private BigDecimal discountPercentage;
    private BigDecimal rebate;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalExcludingTaxes;

    @NotNull
    @PositiveOrZero
    private BigDecimal totalIncludingTaxes;

    @NotNull
    private String currency;

    @NotEmpty
    @Min(1)
    @Valid
    private List<SaleItemDTO> saleItems;

}
