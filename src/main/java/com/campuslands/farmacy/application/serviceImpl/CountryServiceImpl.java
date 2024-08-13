package com.campuslands.farmacy.application.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.farmacy.application.service.CountryService;
import com.campuslands.farmacy.domain.models.Country;
import com.campuslands.farmacy.infrastructure.out.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Long id, Country country) {
        if (countryRepository.existsById(id)) {
            country.setId(id);
            return countryRepository.save(country);
        } else {
            throw new RuntimeException("Country not found with id: " + id);
        }
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Country> fetchCountriesList() {
        return countryRepository.findAll();
    }

}