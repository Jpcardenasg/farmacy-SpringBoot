package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.ActivePrinciple;
public interface ActivePrincipleService {

ActivePrinciple saveActivePrinciple(ActivePrinciple activePrinciple);
ActivePrinciple updateActivePrinciple(Long id, ActivePrinciple activePrinciple);
void deleteActivePrinciple(Long id);
ActivePrinciple getActivePrincipleById(Long id);
List<ActivePrinciple> fetchActivePrinciplesList();

}