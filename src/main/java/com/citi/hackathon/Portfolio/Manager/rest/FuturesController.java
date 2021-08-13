package com.citi.hackathon.Portfolio.Manager.rest;

import com.citi.hackathon.Portfolio.Manager.Entites.Futures;
import com.citi.hackathon.Portfolio.Manager.service.FutureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Futures")
public class FuturesController {

    @Autowired
    private FutureService futureService;

    @GetMapping
    public List<Futures> getFutures() {
        return futureService.getAllFutures();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteFuture(@PathVariable("id") int id) {
        futureService.deleteFuture(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteFuture(@RequestBody Futures fut) {
        futureService.deleteFuture(fut);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addFuture(@RequestBody Futures fut) {
        futureService.addNewFuture(fut);
    }


}
