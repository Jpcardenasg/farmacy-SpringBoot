package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.FarmacyMedicineService;
import com.campuslands.farmacy.domain.models.FarmacyMedicine;
import com.campuslands.farmacy.domain.models.FarmacyMedicineId;
import com.campuslands.farmacy.infrastructure.out.FarmacyMedicineRepository;

@Service
public class FarmacyMedicineServiceImpl implements FarmacyMedicineService {

    @Autowired
    private FarmacyMedicineRepository farmacyMedicineRepository;

    @Override
    public FarmacyMedicine saveFarmacyMedicine(FarmacyMedicine farmacyMedicine) {
        return farmacyMedicineRepository.save(farmacyMedicine);
    }

    @Override
    public FarmacyMedicine updateFarmacyMedicine(FarmacyMedicineId id,  FarmacyMedicine farmacyMedicine) {
        if (farmacyMedicineRepository.existsById(id)) {
            farmacyMedicine.setId(id);
            return farmacyMedicineRepository.save(farmacyMedicine);
        } else {
            throw new RuntimeException("FarmacyMedicine not found with id: " + id);
        }
    }

    @Override
    public void deleteFarmacyMedicine(FarmacyMedicineId id) {
        farmacyMedicineRepository.deleteById(id);
    }

    @Override
    public FarmacyMedicine getFarmacyMedicineById(FarmacyMedicineId id) {
        return farmacyMedicineRepository.findById(id).orElse(null);
    }

    @Override
    public List<FarmacyMedicine> fetchFarmacyMedicinesList() {
        return farmacyMedicineRepository.findAll();
    }

}
