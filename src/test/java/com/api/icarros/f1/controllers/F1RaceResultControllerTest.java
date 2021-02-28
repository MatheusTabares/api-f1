package com.api.icarros.f1.controllers;

import static com.api.icarros.f1.services.exceptions.NotFoundException.F1_RACE_RESULT_NOT_FOUND_EXCEPTION;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.api.icarros.f1.domains.F1RaceResult;
import com.api.icarros.f1.services.F1RaceResultService;
import com.api.icarros.f1.services.exceptions.NotFoundException;

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@WebMvcTest(F1RaceResultController.class)
public class F1RaceResultControllerTest {

    // @LocalServerPort
    // private int port;

    // @Autowired
    // private TestRestTemplate restTemplate;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private F1RaceResultService service;

    @Test
    public void testFindRaceResultByYear() throws Exception {
        List<F1RaceResult> resultsMock = new ArrayList<F1RaceResult>();
        F1RaceResult resultMock = new F1RaceResult(1l, "Mercedes 1", 1, 2020);
        resultsMock.add(resultMock);

        when(service.findByYear(any(Integer.class))).thenReturn(resultsMock);

        this.mockMvc.perform(get("/api/f1/2020/last/results"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Mercedes 1")));
    }

    @Test
    public void testFindRaceResultByYearNotFound() throws Exception {
        when(service.findByYear(any(Integer.class))).thenThrow(new NotFoundException(F1_RACE_RESULT_NOT_FOUND_EXCEPTION));

        this.mockMvc.perform(get("/api/f1/2021/last/results"))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(content().string(containsString(F1_RACE_RESULT_NOT_FOUND_EXCEPTION)));
    }

}
