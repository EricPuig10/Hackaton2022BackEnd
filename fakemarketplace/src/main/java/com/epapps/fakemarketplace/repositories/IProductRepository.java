package com.epapps.fakemarketplace.repositories;

import com.epapps.fakemarketplace.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
}
