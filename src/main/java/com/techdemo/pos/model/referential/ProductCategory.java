package com.techdemo.pos.model.referential;

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
public class ProductCategory {

    @Id
    private UUID id;

    private String code;

    private String name;

    private String description;

}
