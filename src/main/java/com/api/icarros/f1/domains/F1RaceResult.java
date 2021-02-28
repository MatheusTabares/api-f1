package com.api.icarros.f1.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F1_RACE_RESULT")
public class F1RaceResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String car;

    private Integer position;

    private Integer year;

    public F1RaceResult(Long id, String car, Integer position, Integer year) {
        this.id = id;
        this.car = car;
        this.position = position;
        this.year = year;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
