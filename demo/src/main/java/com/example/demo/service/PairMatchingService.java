package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.PairMatchingRepository;

@Service
public class PairMatchingService {
    private final PairMatchingRepository pairMatchingRepository;

    public PairMatchingService(PairMatchingRepository pairMatchingRepository){
        this.pairMatchingRepository = pairMatchingRepository;
    }

    public List<List<String>> getPairs(String level){
        return pairMatchingRepository.getPairs(level, null);
    }
    public List<List<String>> getPairs(String level, String mission){
        return pairMatchingRepository.getPairs(level, mission);
    }
}
