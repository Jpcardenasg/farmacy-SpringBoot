package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.UnitMeasurementService;
import com.campuslands.farmacy.domain.models.UnitMeasurement;
import com.campuslands.farmacy.infrastructure.out.UnitMeasurementRepository;

@Service
public class UnitMeasurementServiceImpl implements UnitMeasurementService {

    @Autowired
    private UnitMeasurementRepository unitMeasurementRepository;

    @Override
    public UnitMeasurement saveUnitMeasurement(UnitMeasurement unitMeasurement) {
        return unitMeasurementRepository.save(unitMeasurement);
    }

    @Override
    public UnitMeasurement updateUnitMeasurement(Long id, UnitMeasurement unitMeasurement) {
        if (unitMeasurementRepository.existsById(id)) {
            unitMeasurement.setId(id);
            return unitMeasurementRepository.save(unitMeasurement);
        } else {
            throw new RuntimeException("UnitMeasurement not found with id: " + id);
        }
    }

    @Override
    public void deleteUnitMeasurement(Long id) {
        unitMeasurementRepository.deleteById(id);
    }

    @Override
    public UnitMeasurement getUnitMeasurementById(Long id) {
        return unitMeasurementRepository.findById(id).orElse(null);
    }

    @Override
    public List<UnitMeasurement> fetchUnitMeasurementsList() {
        return unitMeasurementRepository.findAll();
    }

}