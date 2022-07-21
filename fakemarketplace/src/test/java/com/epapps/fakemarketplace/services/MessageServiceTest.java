package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.dto.MessageRequestDto;
import com.epapps.fakemarketplace.dto.MessageResDto;
import com.epapps.fakemarketplace.mappers.MessageMapper;
import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.repositories.IMessageRepository;
import com.epapps.fakemarketplace.repositories.IProductRepository;
import com.epapps.fakemarketplace.repositories.IUserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class MessageServiceTest {

    @Mock
    IMessageRepository messageRepository;
    IProductRepository productRepository;

    IUserRepository userRepository;


    private Product createProduct(){
        var creator = new User();
        creator.setId(1L);
        var product =  new Product();
        product.setId(1L);
        product.setSeller(creator);
        return product;
    }


    Message createMessage (Product product){
        User creator = new User();
        creator.setId(1L);
        Message message = new Message();
        message.setCreator(creator);
        message.setProduct(product);
        return message;
    }

    private User createUser(){
        User user = new User();
        user.setId(1L);
        return user;
    }

    @Test
    void findAllShouldReturnAllMessages() {
        var messageService = new MessageService(messageRepository, productRepository, userRepository);
        Product product = new Product();
        User creator = new User();
        List<Message> listOfMessages = List.of(new Message(), new Message(), new Message());
        listOfMessages.forEach(Message -> {
            Message.setProduct(product);
            Message.setCreator(creator);
        });
        Mockito.when(messageRepository.findAll()).thenReturn(listOfMessages);
        var sut = messageService.getAll();
        assertThat(sut.size(), equalTo(3));
    }

    @Test
    void findByProductShouldReturnAListOfMessages(){

        var messageService = new MessageService(messageRepository, productRepository, userRepository);
        Product product = this.createProduct();
        Message message = this.createMessage(product);
        List<Message> messages = List.of(message, message, message);
        Mockito.when(messageRepository.findByMomentId(any(Long.class))).thenReturn(messages);
        var sut = messageService.findByProduct(1L);
        assertThat(sut.get(0).getProduct().getId(), equalTo(1L));


    }

    /*
    @Test
    void createShouldReturnAMessageCreated() {


    var messageService = new MessageService(messageRepository);
    MessageRequestDto req = new MessageRequestDto("comment", 1L, 2L);
    Product product = this.createProduct();
    User creator = this.createUser();
    Message message = new MessageMapper().mapReqToComment(req, product, creator);
    MessageResDto res = new MessageMapper().mapCommentToRes(message);
    Mockito.when(messageRepository.save(any(Message.class))).thenReturn(message);
    var sut = messageService.create(req);
    assertThat(sut.getCreator().getUserName(), equalTo(res.getCreator().getUserName()));
    assertThat(sut, equalTo(res));





    }*/
}