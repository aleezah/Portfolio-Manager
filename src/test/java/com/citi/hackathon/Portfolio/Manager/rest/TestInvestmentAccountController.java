package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.InvestmentAccount;
import com.citi.hackathon.Portfolio.Manager.service.InvestmentAccountService;

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
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(InvestmentAccountController.class)
//@ContextConfiguration
public class TestInvestmentAccountController {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InvestmentAccountService service;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testCanRetrieveAllInvestmentAccounts() throws Exception {

        InvestmentAccount InvestmentAccount = new InvestmentAccount(3333.33);
        List<InvestmentAccount> allInvestmentAccounts = Arrays.asList(InvestmentAccount);

        given(service.getAllInvestmentAccounts()).willReturn(allInvestmentAccounts);

        mockMvc.perform(get("/investmentAccount")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].funds", is(3333.33)));

    }

//    @Test
//    public void testCanAddInvestmentaccount() throws Exception {
//
//    }
}
