package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.FundsTransferAccount
        ;
import com.citi.hackathon.Portfolio.Manager.service.FundsTransferAccountService;

import com.citi.hackathon.Portfolio.Manager.service.FundsTransferAccountService;
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
@WebMvcTest(FundsTransferAccountController.class)
//@ContextConfiguration
public class TestFundsTransferAccountController {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FundsTransferAccountService service;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testCanRetrieveAllFundsTransferAccounts() throws Exception {

        FundsTransferAccount fundsTransferAccount = new FundsTransferAccount
                (1, 20000.20, "withdrawal", 1,5);
        List<FundsTransferAccount> allFundsTransferAccounts = Arrays.asList(fundsTransferAccount);

        given(service.getAllTransfers()).willReturn(allFundsTransferAccounts);

        mockMvc.perform(get("/Funds Transfer Account")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].transferType", is("withdrawal")));

    }

//    @Test
//    public void testCanAddFundsTransferAccount
//    () throws Exception {
//
//    }
}
