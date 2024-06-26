package com.example.consuming_rest_apis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class CatFactService {
    private CatRepository catRepository;
    private CatClient catClient;
    @Autowired
    public CatFactService(CatRepository catRepository, CatClient catClient){
        this.catRepository = catRepository;
        this.catClient = catClient;
    }

    public CatFact getCatFact() throws IOException {
        CatFact catFact = catClient.getCatsInfo();
        catRepository.save(catFact);
        return catFact;
    }

    public String postCatFact(CatFact catFact) throws IOException {
        return "OK";
    }
    public String addCatInDataBase(CatFact catFact) {
        catRepository.save(catFact);
        return "Cat is Added";
    }
}
