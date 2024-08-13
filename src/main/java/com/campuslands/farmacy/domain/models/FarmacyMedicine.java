package com.campuslands.farmacy.domain.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FarmacyMedicine {

    @EmbeddedId
    private FarmacyMedicineId id;

    private Double price;

    @ManyToOne
    private Farmacy farmacy;

    @ManyToOne
    private Medicine medicine;
}
