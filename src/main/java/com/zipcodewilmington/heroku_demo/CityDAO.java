package com.zipcodewilmington.heroku_demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityDAO extends PagingAndSortingRepository<City, Long> {
}
