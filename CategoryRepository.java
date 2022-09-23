package com.kasim.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kasim.model.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {

}
