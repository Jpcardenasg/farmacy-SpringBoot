package com.campuslands.farmacy.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.farmacy.domain.models.Farmacy;
@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy,Long> {}