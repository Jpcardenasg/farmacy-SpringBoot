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
public class Medicine {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String proceedings;
    private String namemedicine;
    private String healthregister;
    private String description;
    private String descriptionShort;
    private String namerol;

    @ManyToOne
    private ModeAdministration codemodeadmin;

    @ManyToOne
    private UnitMeasurement codeum;

    @ManyToOne
    private ActivePrinciple codeap;

    @ManyToOne
    private Laboratory codelab;

    @OneToMany(mappedBy = "medicine")
    private List<FarmacyMedicine> farmacyMedicines;

    
}
