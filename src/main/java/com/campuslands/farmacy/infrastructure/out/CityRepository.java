package com.campuslands.farmacy.infrastructure.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.farmacy.domain.models.City;
@Repository
public interface CityRepository extends JpaRepository<City,Long> {}