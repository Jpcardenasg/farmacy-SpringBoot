package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.FarmacyService;
import com.campuslands.farmacy.domain.models.Farmacy;
import com.campuslands.farmacy.infrastructure.out.FarmacyRepository;

@Service
public class FarmacyServiceImpl implements FarmacyService {

    @Autowired
    private FarmacyRepository farmacyRepository;

    @Override
    public Farmacy saveFarmacy(Farmacy farmacy) {
        return farmacyRepository.save(farmacy);
    }

    @Override
    public Farmacy updateFarmacy(Long id, Farmacy farmacy) {
        if (farmacyRepository.existsById(id)) {
            farmacy.setId(id);
            return farmacyRepository.save(farmacy);
        } else {
            throw new RuntimeException("Farmacy not found with id: " + id);
        }
    }

    @Override
    public void deleteFarmacy(Long id) {
        farmacyRepository.deleteById(id);
    }

    @Override
    public Farmacy getFarmacyById(Long id) {
        return farmacyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Farmacy> fetchFarmaciesList() {
        return farmacyRepository.findAll();
    }

}
