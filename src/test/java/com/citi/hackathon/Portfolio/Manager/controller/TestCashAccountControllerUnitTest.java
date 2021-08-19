package com.citi.hackathon.Portfolio.Manager.controller;

import com.citi.hackathon.Portfolio.Manager.Entites.CashAccount;
import com.citi.hackathon.Portfolio.Manager.repo.CashAccountRepository;
import com.citi.hackathon.Portfolio.Manager.rest.CashAccountController;
import com.citi.hackathon.Portfolio.Manager.service.CashAccountService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class TestCashAccountControllerUnitTest {
    protected static class Config{

        @Bean
        @Primary
        public CashAccountRepository repo() {return mock(CashAccountRepository.class);}

        @Bean
        @Primary
        public CashAccountService service() {
            CashAccount cashAccount = new CashAccount();
            List<CashAccount> cashAccounts = new ArrayList<>();
            cashAccounts.add(cashAccount);

            CashAccountService service = mock(CashAccountService.class);
            when(service.getAllCashAccount()).thenReturn(cashAccounts);
            //when(service.getAllCashAccount()
            return service;
        }

        @Bean
        @Primary
        public CashAccountController controller() {
            return new CashAccountController();
        }

    }

    @Autowired
    private CashAccountController controller;

//    @Test
//    @Disabled
//    public void testGetAllCashAccount() {
//        Iterable<CashAccount> cashAccounts = controller.getAllCashAccount();
//        Stream<CashAccount> stream = StreamSupport.stream(cashAccounts.spliterator(), false);
//        assertThat(stream.count(), equalTo(1L));
//    }
}
