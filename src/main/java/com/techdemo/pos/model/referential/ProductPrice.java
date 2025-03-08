package com.techdemo.pos.model.referential;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductPrice {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Store store;

    @Column(nullable = false)
    private BigDecimal price;

    private BigDecimal discountPercentage;
    private BigDecimal rebate;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private OffsetDateTime startDate;

    private OffsetDateTime endDate;

    private boolean active;
}
