package com.epapps.fakemarketplace.services;


import com.epapps.fakemarketplace.dto.ProductRequestDto;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private IProductRepository productRepository;

    public ProductService(IProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        Product opProduct = productRepository.findById(id).get();

        return opProduct;
    }

    @Override
    public List<Product> search(String search) {
        var searchCollection = this.productRepository.findByNameContainsIgnoreCase(search);
        return searchCollection;
    }



}
