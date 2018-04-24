package com.zipcodewilmington.heroku_demo;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemDAO extends PagingAndSortingRepository<Long, Item> {
}
