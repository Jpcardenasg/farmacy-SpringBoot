package com.campuslands.farmacy.domain.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Farmacy {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String namefarmacy;
    private String addressfarmacy;
    private Double longfarmacy;
    private Long latfarmacy;

    @ManyToOne
    private City codecityfarm;

    @OneToMany(mappedBy = "farmacy")
    private List<FarmacyMedicine> farmacyMedicine;
    
}
