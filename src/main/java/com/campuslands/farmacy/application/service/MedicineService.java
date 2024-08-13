package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Medicine;
public interface MedicineService {

Medicine saveMedicine(Medicine medicine);
Medicine updateMedicine(Long id, Medicine medicine);
void deleteMedicine(Long id);
Medicine getMedicineById(Long id);
List<Medicine> fetchMedicinesList();

}