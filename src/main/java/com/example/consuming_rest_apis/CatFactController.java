package com.example.consuming_rest_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class CatFactController {

    private final CatFactService catFactService;

    @Autowired
    public CatFactController(CatFactService catFactService) {
        this.catFactService = catFactService;
    }


    @GetMapping("/catfact")
    public CatFact getCatFact() throws IOException {
        return catFactService.getCatFact();
    }

    @PostMapping("/post")
    public String postCatFact(@RequestBody CatFact catFact) throws IOException {
        return catFactService.postCatFact(catFact);
    }
    @PostMapping("/add")
    public String addCatFact(@RequestBody CatFact catFact) throws IOException {
        return catFactService.addCatInDataBase(catFact);
    }

}