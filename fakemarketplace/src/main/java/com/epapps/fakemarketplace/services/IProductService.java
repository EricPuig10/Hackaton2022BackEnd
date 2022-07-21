package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.Product;

import java.util.List;

public interface IProductService{
    List<Product> getAll();

    Product getById(Long id);

    List<Product> search(String search);

}
