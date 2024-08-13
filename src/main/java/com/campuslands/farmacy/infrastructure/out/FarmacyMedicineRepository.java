package com.campuslands.farmacy.infrastructure.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.farmacy.domain.models.FarmacyMedicine;
import com.campuslands.farmacy.domain.models.FarmacyMedicineId;
@Repository
public interface FarmacyMedicineRepository extends JpaRepository<FarmacyMedicine,FarmacyMedicineId> {}