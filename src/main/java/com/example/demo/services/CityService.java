package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private ICityRepository repository;

    @Override
    public List<City> getAll() { return (List<City>) repository.findAll(); }

    @Override
    public City getById(Long id) {
        return (City) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(City city) {
        repository.save(city);
    }

    @Override
    public List<City> getCitiesByCountryId(Long id) {
        return (List<City>) repository.getCitiesByCountryId(id);
    }
}
