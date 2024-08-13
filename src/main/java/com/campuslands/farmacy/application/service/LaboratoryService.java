package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Laboratory;
public interface LaboratoryService {

Laboratory saveLaboratory(Laboratory laboratory);
Laboratory updateLaboratory(Long id, Laboratory laboratory);
void deleteLaboratory(Long id);
Laboratory getLaboratoryById(Long id);
List<Laboratory> fetchLaboratoriesList();

}