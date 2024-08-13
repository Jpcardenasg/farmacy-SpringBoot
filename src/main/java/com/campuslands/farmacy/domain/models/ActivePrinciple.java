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
public class ActivePrinciple {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nameap;

    @OneToMany(mappedBy="codeap")
    private List<Medicine> medicines;
    
}
