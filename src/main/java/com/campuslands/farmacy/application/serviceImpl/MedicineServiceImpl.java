package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.MedicineService;
import com.campuslands.farmacy.domain.models.Medicine;
import com.campuslands.farmacy.infrastructure.out.MedicineRepository;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine updateMedicine(Long id, Medicine medicine) {
        if (medicineRepository.existsById(id)) {
            medicine.setId(id);
            return medicineRepository.save(medicine);
        } else {
            throw new RuntimeException("Medicine not found with id: " + id);
        }
    }

    @Override
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }

    @Override
    public Medicine getMedicineById(Long id) {
        return medicineRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medicine> fetchMedicinesList() {
        return medicineRepository.findAll();
    }

}
