package com.sreejin.beststore.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sreejin.beststore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
