package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.ModeAdministrationService;
import com.campuslands.farmacy.domain.models.ModeAdministration;
import com.campuslands.farmacy.infrastructure.out.ModeAdministrationRepository;

@Service
public class ModeAdministrationServiceImpl implements ModeAdministrationService {

    @Autowired
    private ModeAdministrationRepository modeAdministrationRepository;

    @Override
    public ModeAdministration saveModeAdministration(ModeAdministration modeAdministration) {
        return modeAdministrationRepository.save(modeAdministration);
    }

    @Override
    public ModeAdministration updateModeAdministration(Long id, ModeAdministration modeAdministration) {
        if (modeAdministrationRepository.existsById(id)) {
            modeAdministration.setId(id);
            return modeAdministrationRepository.save(modeAdministration);
        } else {
            throw new RuntimeException("ModeAdministration not found with id: " + id);
        }
    }

    @Override
    public void deleteModeAdministration(Long id) {
        modeAdministrationRepository.deleteById(id);
    }

    @Override
    public ModeAdministration getModeAdministrationById(Long id) {
        return modeAdministrationRepository.findById(id).orElse(null);
    }

    @Override
    public List<ModeAdministration> fetchModeAdministrationsList() {
        return modeAdministrationRepository.findAll();
    }

}
