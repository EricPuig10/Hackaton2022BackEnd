package com.epapps.fakemarketplace.controllers;

import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.services.IProductService;
import com.epapps.fakemarketplace.services.IUserService;
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

    @GetMapping(value="/products", params="search")
    List<Product> getSearch(@RequestParam String search){
        return productService.search(search);
    }





}
