package com.techdemo.pos.model.sale;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Sale", indexes = {
        @Index(name = "idx_sale_store_id", columnList = "store_id")
})
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Sale  {

    @Id
    private Long id;

    @Column(nullable = false)
    private OffsetDateTime date;

    private UUID storeId;

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false)
    private String storeAddress;

    private BigDecimal discountPercentage;
    private BigDecimal rebate;

    @Column(nullable = false)
    private BigDecimal totalExcludingTaxes;

    @Column(nullable = false)
    private BigDecimal totalIncludingTaxes;

    @Column(nullable = false)
    private String currency;

    @OneToMany(mappedBy = "sale", orphanRemoval = true)
    @ToString.Exclude
    private List<SaleItem> saleItems;


    private byte[] digitalSignature;


}
