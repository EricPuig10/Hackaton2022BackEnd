package com.epapps.fakemarketplace.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void messagesCount() {
        Product product = new Product();
        Message message = new Message();

        product.addMessage((message));

        int sut = product.messagesCount();

        assertThat(sut, equalTo(1));
    }

    

}