package com.campuslands.farmacy.domain.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitMeasurement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nameum;

    @OneToMany(mappedBy = "codeum")
    private List<Medicine> medicines;
    
}
