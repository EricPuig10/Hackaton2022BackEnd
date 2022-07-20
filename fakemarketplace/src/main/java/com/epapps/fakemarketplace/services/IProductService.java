package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.dto.ProductRequestDto;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;

import java.util.List;

public interface IProductService{
    List<Product> getAll();

    Product getById(Long id);

}
