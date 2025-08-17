package com.spring_data_jpa_mapping.repository;

import com.spring_data_jpa_mapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
