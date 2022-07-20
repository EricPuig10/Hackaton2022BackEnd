package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.dto.ProductRequestDto;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.repositories.IProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
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
    void createSaveAProductMappedFromDTO() {
        ProductService productService = new ProductService(productRepository);

        ProductRequestDto productRequest = new ProductRequestDto("Product 1", "das.jpg", 50d);
        User seller = new User();
        seller.setId(1L);

        Product product = new Product();
        product.setName("Product1");
        product.setImg("das.jpg");
        product.setId(1L);
        product.setSeller(seller);
        product.setPrice(50d);

        Mockito.when(productRepository.save(any(Product.class))).thenReturn(product);
        Product sut = productService.create(productRequest, seller);

        assertThat(sut.getSeller(), equalTo(seller));
    }
}