package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.service.FutureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteFuture(@PathVariable("id") int id) {
        futureService.deleteFuture(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteFuture(@RequestBody Future fut) {
        futureService.deleteFuture(fut);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addFuture(@RequestBody Future fut) {
        futureService.addNewFuture(fut);
    }


}
