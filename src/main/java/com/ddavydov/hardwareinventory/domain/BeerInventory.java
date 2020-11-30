package com.ddavydov.hardwareinventory.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity{

    @Builder
    public BeerInventory(UUID id, Timestamp createdDate, Timestamp lastModifiedDate, UUID hardwareId,
                         String upc, Integer quantityOnHand) {
        super(id, createdDate, lastModifiedDate);
        this.hardwareId = hardwareId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }

    private UUID hardwareId;
    private String upc;
    private Integer quantityOnHand = 0;
}
