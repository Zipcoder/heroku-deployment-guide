package com.zipcodewilmington.heroku_demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends PagingAndSortingRepository<City, Long> {
}
