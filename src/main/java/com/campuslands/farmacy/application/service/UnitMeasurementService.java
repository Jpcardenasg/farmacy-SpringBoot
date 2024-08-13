package com.campuslands.farmacy.application.service;


import java.util.List;

import com.campuslands.farmacy.domain.models.UnitMeasurement;
public interface UnitMeasurementService {

    UnitMeasurement saveUnitMeasurement(UnitMeasurement unitMeasurement);
    UnitMeasurement updateUnitMeasurement(Long id, UnitMeasurement unitMeasurement);
    void deleteUnitMeasurement(Long id);
    UnitMeasurement getUnitMeasurementById(Long id);
    List<UnitMeasurement> fetchUnitMeasurementsList();

}