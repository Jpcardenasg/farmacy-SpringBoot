package com.campuslands.farmacy.infrastructure.in;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.farmacy.application.service.CountryService;
import com.campuslands.farmacy.domain.models.Country;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private CountryService service;

    @PostMapping("/saveCountry")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
        service.saveCountry(country);
        return ResponseEntity.ok(country);
    }

    @PutMapping("/updateCountry/{countryId}")
    public ResponseEntity<Country> updateCountry(@PathVariable Long countryId, @RequestBody Country country) {
        service.updateCountry(countryId, country);
        return ResponseEntity.ok(country);
    }

    @DeleteMapping("/deleteCountry/{countryId}")
    public ResponseEntity<Long> deleteCountry(@PathVariable Long countryId) {
        service.deleteCountry(countryId);
        return ResponseEntity.ok(countryId);
    }

    @GetMapping("/allCountries")
    public ResponseEntity<List<Country>> findAll() {
        return ResponseEntity.ok(service.fetchCountriesList());
    }
}