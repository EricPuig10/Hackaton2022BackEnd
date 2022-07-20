package com.epapps.fakemarketplace.repositories;

import com.epapps.fakemarketplace.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

    @Query("select p from Product p " +
            "where upper(p.name) like upper(concat('%', :search, '%'))")
    List <Product>  findByNameContainsIgnoreCase(@Param("search") String search);

}
