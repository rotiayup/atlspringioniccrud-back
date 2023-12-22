package com.example.demo.controllers;

import com.example.demo.entities.City;
import com.example.demo.services.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    private ICityService service;

    @GetMapping("/api/cities")
    public List<City> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/citiesbycountry/{id}")
    public List<City> getCitiesbyCountryId(@PathVariable String id) {
//        System.out.println("xaitorrrr0_");
        return service.getCitiesByCountryId(Long.parseLong(id));
    }

    @GetMapping("/api/cities/{id}")
    public City getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/cities/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/cities")
    public void save(@RequestBody City city) {
        service.save(city);
    }

}
