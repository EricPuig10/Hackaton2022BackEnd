package com.epapps.fakemarketplace.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void commentCount(){
        Product product = new Product();
        Comment comment = new Comment();

        product.addComment((comment));

        int sut = product.commentCount();

        assertThat(sut, equalTo(1));
    }
}