package com.example.demo.services;

import com.example.demo.entities.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    City getById(Long id);
    void remove(Long id);
    void save(City city);
    List<City> getCitiesByCountryId(Long id);
}
