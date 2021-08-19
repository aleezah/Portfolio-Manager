package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.StockTransaction;
import com.citi.hackathon.Portfolio.Manager.service.StockTransactionService;

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

import java.text.SimpleDateFormat;
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
@WebMvcTest(StockTransactionController.class)
//@ContextConfiguration
public class TestStockTransactionController {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StockTransactionService service;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void testCanRetrieveAllStockTransactions() throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");
        StockTransaction StockTransaction = new StockTransaction(1, ft.parse("2020-05-06 10:45:06"), 60.54, "Purchase Stocks", "GOOGL", 3, 4);
            List<StockTransaction> allStockTransactions = Arrays.asList(StockTransaction);

        given(service.getAllStockTransaction()).willReturn(allStockTransactions);

        mockMvc.perform(get("/stocktransaction/all")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].stockName", is("GOOGL")));

    }

//    @Test
//    public void testCanAddStockTransaction() throws Exception {
//
//    }
}
