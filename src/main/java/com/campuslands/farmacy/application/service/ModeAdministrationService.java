package com.campuslands.farmacy.application.service;


import java.util.List;

import com.campuslands.farmacy.domain.models.ModeAdministration;

public interface ModeAdministrationService {

    ModeAdministration saveModeAdministration(ModeAdministration modeAdministration);
    ModeAdministration updateModeAdministration(Long id, ModeAdministration modeAdministration);
    void deleteModeAdministration(Long id);
    ModeAdministration getModeAdministrationById(Long id);
    List<ModeAdministration> fetchModeAdministrationsList();

}