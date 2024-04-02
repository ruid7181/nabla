package com.ucas.nabla.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ucas.nabla.entity.TmData;
import com.ucas.nabla.repository.TmDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TmDataHandler {

    @Autowired
    private TmDataRepository tmDataRepository;

    @GetMapping("/findAll")
    public List<TmData> findAll(){
        return tmDataRepository.findAll();   // findAll() method is implemented by JPA, extended by TmDataRepository.
    }

    @GetMapping("/findBySat/{sat}")
    public List<TmData> findBySat(@PathVariable("sat") String sat){
        return tmDataRepository.findBySat(sat);
    }

    @PostMapping("/save")
    public TmData save(@RequestBody TmData tmData){
        return tmDataRepository.save(tmData);
    }
}
