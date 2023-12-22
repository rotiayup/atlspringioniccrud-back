package com.example.demo.controllers;

import com.example.demo.entities.Country;
import com.example.demo.services.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ICountryService service;

    @GetMapping("/api/countries")
    public List<Country> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/countries/{id}")
    public Country getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/countries/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/countries")
    public void save(@RequestBody Country country) {
        service.save(country);
    }

}
