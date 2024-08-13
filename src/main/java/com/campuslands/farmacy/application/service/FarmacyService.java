package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Farmacy;
public interface FarmacyService {

Farmacy saveFarmacy(Farmacy farmacy);
Farmacy updateFarmacy(Long id, Farmacy farmacy);
void deleteFarmacy(Long id);
Farmacy getFarmacyById(Long id);
List<Farmacy> fetchFarmaciesList();

}
