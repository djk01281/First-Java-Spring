package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PairMatchingService;

import java.util.List;

@RestController
public class PairMatchingController {
    private final PairMatchingService pairMatchingService;

    //You can also use @Autowired
    public PairMatchingController(PairMatchingService pairMatchingService){
        this.pairMatchingService = pairMatchingService;
    }

    @GetMapping(value="/api/pairMatching/{level}/{mission}")
    public List<List<String>> get(@PathVariable String level, @PathVariable String mission){
        return pairMatchingService.getPairs(level, mission);
    }
    @GetMapping(value="/api/pairMatching/{level}")
    public List<List<String>> get(@PathVariable String level){
        return pairMatchingService.getPairs(level);
    }
}