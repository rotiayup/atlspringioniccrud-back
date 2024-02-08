package com.example.demo.repository;

import com.example.demo.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface ICityRepository extends CrudRepository<City,Long> {

    @Query("SELECT c FROM City c WHERE 1=1 and c.countryid.id = :countryId")
    List<City> getCitiesByCountryId(@Param("countryId") Long countryId);
}

