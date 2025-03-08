package com.techdemo.pos.model.referential;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Store {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String address;

    @ManyToOne
    private Company company;


}
