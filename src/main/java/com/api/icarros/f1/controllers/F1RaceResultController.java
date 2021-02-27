package com.api.icarros.f1.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.icarros.f1.domains.F1RaceResult;
import com.api.icarros.f1.dtos.F1RaceResultDTO;
import com.api.icarros.f1.services.F1RaceResultService;

@RestController
@RequestMapping(value = "/api/f1")
public class F1RaceResultController {

    @Autowired
    public F1RaceResultService f1RaceResultService;

    @GetMapping("/{year}/last/results")
    public ResponseEntity<List<F1RaceResultDTO>> findByYear(@PathVariable Integer year) {
        List<F1RaceResult> list = f1RaceResultService.findByYear(year);
        List<F1RaceResultDTO> listDTO = list.stream().map(obj -> new F1RaceResultDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

}
