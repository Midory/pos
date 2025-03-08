package com.techdemo.pos.model.referential;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Inventory {

    @Id
    private UUID id;

    @ManyToOne
    private Store store;

    @OneToMany(mappedBy = "inventory", orphanRemoval = true)
    @ToString.Exclude
    private List<ProductInventory> productInventories;

}
