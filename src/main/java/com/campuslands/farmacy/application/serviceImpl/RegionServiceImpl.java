package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.RegionService;
import com.campuslands.farmacy.domain.models.Region;
import com.campuslands.farmacy.infrastructure.out.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region updateRegion(Long id, Region region) {
        if (regionRepository.existsById(id)) {
            region.setId(id);
            return regionRepository.save(region);
        } else {
            throw new RuntimeException("Region not found with id: " + id);
        }
    }

    @Override
    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }

    @Override
    public Region getRegionById(Long id) {
        return regionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Region> fetchRegionsList() {
        return regionRepository.findAll();
    }

}
