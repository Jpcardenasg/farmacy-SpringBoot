package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.LaboratoryService;
import com.campuslands.farmacy.domain.models.Laboratory;
import com.campuslands.farmacy.infrastructure.out.LaboratoryRepository;

@Service
public class LaboratoryServiceImpl implements LaboratoryService {

    @Autowired
    private LaboratoryRepository laboratoryRepository;

    @Override
    public Laboratory saveLaboratory(Laboratory laboratory) {
        return laboratoryRepository.save(laboratory);
    }

    @Override
    public Laboratory updateLaboratory(Long id, Laboratory laboratory) {
        if (laboratoryRepository.existsById(id)) {
            laboratory.setId(id);
            return laboratoryRepository.save(laboratory);
        } else {
            throw new RuntimeException("Laboratory not found with id: " + id);
        }
    }

    @Override
    public void deleteLaboratory(Long id) {
        laboratoryRepository.deleteById(id);
    }

    @Override
    public Laboratory getLaboratoryById(Long id) {
        return laboratoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Laboratory> fetchLaboratoriesList() {
        return laboratoryRepository.findAll();
    }

}
