package com.campuslands.farmacy.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.farmacy.domain.models.Laboratory;
@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory,Long> {}
