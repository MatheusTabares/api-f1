package com.api.icarros.f1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.icarros.f1.domains.F1RaceResult;
import com.api.icarros.f1.repositories.F1RaceResultRepository;
import com.api.icarros.f1.services.F1RaceResultService;

@Service
public class F1RaceResultServiceImpl implements F1RaceResultService {

    @Autowired
    private F1RaceResultRepository f1RaceResultRepository;

    @Override
    public List<F1RaceResult> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
