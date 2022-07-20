package com.epapps.fakemarketplace.controllers;

import com.epapps.fakemarketplace.dto.ProductRequestDto;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.services.IProductService;
import com.epapps.fakemarketplace.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    private IProductService productService;
    private IUserService userService;

    public ProductController(IProductService productService, IUserService userService) {
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping("/products")
    List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping ("/products/{id}")
    Product getById(@PathVariable Long id){
        Product product = productService.getById(id);
        return product;
    }





}
