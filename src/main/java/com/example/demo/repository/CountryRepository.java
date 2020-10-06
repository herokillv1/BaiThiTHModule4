package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country,Long> {
}
