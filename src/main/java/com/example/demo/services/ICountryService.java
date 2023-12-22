package com.example.demo.services;

import com.example.demo.entities.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAll();
    Country getById(Long id);
    void remove(Long id);
    void save(Country country);
}
