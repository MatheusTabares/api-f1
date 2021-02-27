package com.api.icarros.f1.services.impl;

import static com.api.icarros.f1.services.exceptions.NotFoundException.F1_RACE_RESULT_NOT_FOUND_EXCEPTION;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.icarros.f1.domains.F1RaceResult;
import com.api.icarros.f1.repositories.F1RaceResultRepository;
import com.api.icarros.f1.services.F1RaceResultService;
import com.api.icarros.f1.services.exceptions.NotFoundException;;

@Service
public class F1RaceResultServiceImpl implements F1RaceResultService {

    private static final Logger LOGGER = LoggerFactory.getLogger(F1RaceResultServiceImpl.class);

    @Autowired
    private F1RaceResultRepository f1RaceResultRepository;

    @Override
    public List<F1RaceResult> findByYear(Integer year) {
        List<F1RaceResult> results = f1RaceResultRepository.findByYear(year);
        if (results == null || results.isEmpty()) {
            LOGGER.error(F1_RACE_RESULT_NOT_FOUND_EXCEPTION.concat(", by year:").concat(year.toString()));
            throw new NotFoundException(F1_RACE_RESULT_NOT_FOUND_EXCEPTION);
        }
        return results;
    }

}
