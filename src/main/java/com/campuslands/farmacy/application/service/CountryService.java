package com.campuslands.farmacy.application.service;

import java.util.List;

import com.campuslands.farmacy.domain.models.Country;
public interface CountryService {

Country saveCountry(Country country);
Country updateCountry(Long id, Country country);
void deleteCountry(Long id);
Country getCountryById(Long id);
List<Country> fetchCountriesList();

}