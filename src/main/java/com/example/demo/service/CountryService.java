package com.example.demo.service;

import com.example.demo.model.Country;


public interface CountryService {

    Iterable<Country> findAll();

    Country findById(Long id);

    void save(Country category);

    void remove(Long id);
}
