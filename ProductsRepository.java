package com.kasim.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kasim.model.Products;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<Products, Integer> {

}
