package com.techdemo.pos.model.sale;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.techdemo.pos.model.referential.Product;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "SaleItem", indexes = {
        @Index(name = "idx_saleitem_sale_id", columnList = "sale_id")
})
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SaleItem {

    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID productId;

    @Column(nullable = false)
    private String productCode;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private BigDecimal vat;

    @Column(nullable = false)
    private BigDecimal priceWithTaxes;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private Integer quantity;

    private BigDecimal discountPercentage;
    private BigDecimal rebate;

    private BigDecimal totalExcludingTaxesBeforeDiscount;
    private BigDecimal totalIncludingTaxesBeforeDiscount;

    @Column(nullable = false)
    private BigDecimal totalExcludingTaxesAfterDiscount;

    @Column(nullable = false)
    private BigDecimal totalIncludingTaxesAfterDiscount;


    @ManyToOne(optional = false)
    @JsonBackReference
    private Sale sale;

}
