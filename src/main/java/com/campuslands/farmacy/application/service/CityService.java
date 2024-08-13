package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.City;
public interface CityService {

City saveCity(City city);
City updateCity(Long id, City city);
void deleteCity(Long id);
City getCityById(Long id);
List<City> fetchCitiesList();

}
