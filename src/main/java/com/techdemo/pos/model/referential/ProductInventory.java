package com.techdemo.pos.model.referential;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductInventory {

    @Id
    private UUID id;

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne(optional = false)
    private Inventory inventory;
}
