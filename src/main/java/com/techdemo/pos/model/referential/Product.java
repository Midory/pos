package com.techdemo.pos.model.referential;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private String name;

    private String description;

    private String barcode;

    @ManyToOne
    private ProductCategory productCategory;

    @Column(columnDefinition = "jsonb")
    private String productAttributeValues;

}
