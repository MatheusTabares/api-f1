package com.api.icarros.f1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.icarros.f1.domains.F1RaceResult;

@Repository
public interface F1RaceResultRepository extends JpaRepository<F1RaceResult, Long> {

    List<F1RaceResult> findByYear(Integer year);

}
