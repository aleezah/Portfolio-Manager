package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.ETF;
import com.citi.hackathon.Portfolio.Manager.service.ETFService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(ETFController.class)
//@ContextConfiguration
public class TestETFController {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ETFService service;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testCanRetrieveAllETFs() throws Exception {

        ETF ETF = new ETF("S&P 500", 500.01, 1, new Date(2020,1,31), 5);
        List<ETF> allETFs = Arrays.asList(ETF);

        given(service.getAllETFs()).willReturn(allETFs);

        mockMvc.perform(get("/etf")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is("S&P 500")));

    }

//    @Test
//    public void testCanAddETF() throws Exception {
//
//    }
}
