package com.techdemo.pos.model.referential;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Company {

    @Id
    private UUID id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "company")
    @ToString.Exclude
    private List<Store> stores;

}
