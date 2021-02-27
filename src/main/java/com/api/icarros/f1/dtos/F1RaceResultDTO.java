package com.api.icarros.f1.dtos;

import com.api.icarros.f1.domains.F1RaceResult;

public class F1RaceResultDTO {

    private Long id;
    private String car;
    private Integer position;

    public F1RaceResultDTO(F1RaceResult f1RaceResult) {
        id = f1RaceResult.getId();
        car = f1RaceResult.getCar();
        position = f1RaceResult.getPosition();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}
