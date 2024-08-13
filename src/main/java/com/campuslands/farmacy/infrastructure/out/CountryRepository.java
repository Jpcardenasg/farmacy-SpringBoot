
package com.campuslands.farmacy.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.farmacy.domain.models.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {}