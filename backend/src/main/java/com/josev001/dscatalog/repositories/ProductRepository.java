package com.josev001.dscatalog.repositories;


import com.josev001.dscatalog.entities.Category;
import com.josev001.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
