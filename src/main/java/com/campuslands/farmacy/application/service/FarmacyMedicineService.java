package com.campuslands.farmacy.application.service;


import java.util.List;

import com.campuslands.farmacy.domain.models.FarmacyMedicine;
import com.campuslands.farmacy.domain.models.FarmacyMedicineId;
public interface FarmacyMedicineService {

    FarmacyMedicine saveFarmacyMedicine(FarmacyMedicine farmacyMedicine);
    FarmacyMedicine updateFarmacyMedicine(FarmacyMedicineId id,  FarmacyMedicine farmacyMedicine);
    void deleteFarmacyMedicine(FarmacyMedicineId id);
    FarmacyMedicine getFarmacyMedicineById(FarmacyMedicineId id);
    List<FarmacyMedicine> fetchFarmacyMedicinesList();

}