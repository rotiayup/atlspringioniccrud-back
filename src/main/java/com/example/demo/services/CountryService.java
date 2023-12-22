package com.example.demo.services;

import com.example.demo.entities.Country;
import com.example.demo.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountryRepository repository;

    @Override
    public List<Country> getAll() {
        return (List<Country>) repository.findAll();
    }

    @Override
    public Country getById(Long id) {
        return (Country) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Country country) {
        repository.save(country);
    }
}
