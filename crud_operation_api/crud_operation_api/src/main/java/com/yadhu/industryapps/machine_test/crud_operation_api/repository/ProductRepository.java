package com.yadhu.industryapps.machine_test.crud_operation_api.repository;


import com.yadhu.industryapps.machine_test.crud_operation_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {}
