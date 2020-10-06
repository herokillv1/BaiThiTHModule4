package com.example.demo.repository;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends PagingAndSortingRepository<City,Long> {
    Iterable<City> findAllByCountry(Country country);
    Page<City> findAllByNameContaining(String name, Pageable pageable);
}
