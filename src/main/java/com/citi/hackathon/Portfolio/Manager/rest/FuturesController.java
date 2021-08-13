package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.service.FutureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/Futures")
public class FuturesController {

    @Autowired
    private FutureService futureService;

    @GetMapping
    public List<Future> getFutures() {
        return futureService.getAllFutures();
    }

}
