package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.ActivePrincipleService;
import com.campuslands.farmacy.domain.models.ActivePrinciple;
import com.campuslands.farmacy.infrastructure.out.ActivePrincipleRepository;

@Service
public class ActivePrincipleServiceImpl implements ActivePrincipleService {

    @Autowired
    private ActivePrincipleRepository activePrincipleRepository;

    @Override
    public ActivePrinciple saveActivePrinciple(ActivePrinciple activePrinciple) {
        return activePrincipleRepository.save(activePrinciple);
    }

    @Override
    public ActivePrinciple updateActivePrinciple(Long id, ActivePrinciple activePrinciple) {
        if (activePrincipleRepository.existsById(id)) {
            activePrinciple.setId(id);
            return activePrincipleRepository.save(activePrinciple);
        } else {
            throw new RuntimeException("ActivePrinciple not found with id: " + id);
        }
    }

    @Override
    public void deleteActivePrinciple(Long id) {
        activePrincipleRepository.deleteById(id);
    }

    @Override
    public ActivePrinciple getActivePrincipleById(Long id) {
        return activePrincipleRepository.findById(id).orElse(null);
    }

    @Override
    public List<ActivePrinciple> fetchActivePrinciplesList() {
        return activePrincipleRepository.findAll();
    }

}
