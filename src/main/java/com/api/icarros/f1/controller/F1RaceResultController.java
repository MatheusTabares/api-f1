package com.api.icarros.f1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.icarros.f1.service.F1RaceResultService;

@RestController
@RequestMapping(value = "/f1RaceResult")
public class F1RaceResultController {

    @Autowired
    public F1RaceResultService f1RaceResultService;
}
