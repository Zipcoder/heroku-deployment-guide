package com.zipcodewilmington.heroku_demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDAO extends PagingAndSortingRepository<Long, Item> {
}
