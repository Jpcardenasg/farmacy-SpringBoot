package com.campuslands.farmacy.domain.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    
    @Id
    private String id;
    private String namecustomer;
    private String lastnamecustomer;
    private String emailcustomer;
    private Date birthdate;
    private Double longcustomer;
    private Double latcustomer;

    @ManyToOne
    private City codecitycustomer;
}
