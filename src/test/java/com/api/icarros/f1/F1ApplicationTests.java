package com.api.icarros.f1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.icarros.f1.controllers.F1RaceResultController;

@SpringBootTest
class F1ApplicationTests {

    @Autowired
    private F1RaceResultController f1RaceResultController;

    @Test
    void contextLoads() {
        assertThat(f1RaceResultController).isNotNull();
    }

}
