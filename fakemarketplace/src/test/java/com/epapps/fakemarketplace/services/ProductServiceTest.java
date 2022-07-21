package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.repositories.IProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class ProductServiceTest {

    @Mock
    IProductRepository productRepository;

    @Test
    void getAllReturnsListOfProducts() {
    ProductService productService = new ProductService(productRepository);
    List<Product> productList = List.of(new Product(), new Product());
        Mockito.when(productRepository.findAll()).thenReturn(productList);

        List sut = productService.getAll();

        assertThat(sut.size(), equalTo(2));
    }

    @Test
    void findByIdReturnsAnIdIfExists() {
        var productService = new ProductService(productRepository);
        var product = new Product();
        product.setId(1L);
        Mockito.when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        Long id = 1L;
        var sut = productService.getById(id);
        assertThat (sut.getId(), equalTo(product.getId()));

    }

    @Test
    void searchShouldReturnAListOfMoments() {
        var productService = new ProductService(productRepository);
        Product product = new Product();
        product.setName("title");
        product.setDescription("desc");
        product.setCategory("art");
        product.setImg("img");
        product.setPrice(1.0);

        Product product2 = new Product();
        product2.setName(product.getName());
        product2.setDescription(product.getDescription());
        product2.setImg(product.getImg());
        product2.setCategory(product.getCategory());
        product2.setPrice(product.getPrice());

        var searched = List.of(product);

        var found = List.of(product2);

        Mockito.when(productRepository.findByNameContainsIgnoreCase(any(String.class))).thenReturn(searched);

        var sut = productService.search("title");

        assertThat(sut, equalTo(found));


    }







}