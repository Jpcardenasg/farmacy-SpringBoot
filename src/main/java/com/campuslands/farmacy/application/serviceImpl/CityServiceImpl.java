package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.CityService;
import com.campuslands.farmacy.domain.models.City;
import com.campuslands.farmacy.infrastructure.out.CityRepository;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(Long id, City city) {
        if (cityRepository.existsById(id)) {
            city.setId(id);
            return cityRepository.save(city);
        } else {
            throw new RuntimeException("City not found with id: " + id);
        }
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public List<City> fetchCitiesList() {
        return cityRepository.findAll();
    }

}
