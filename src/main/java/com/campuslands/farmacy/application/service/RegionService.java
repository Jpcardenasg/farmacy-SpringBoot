package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Region;
public interface RegionService {

Region saveRegion(Region region);
Region updateRegion(Long id, Region region);
void deleteRegion(Long id);
Region getRegionById(Long id);
List<Region> fetchRegionsList();

}