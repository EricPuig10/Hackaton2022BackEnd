package com.epapps.fakemarketplace.controllers;


import com.epapps.fakemarketplace.dto.MessageRequestDto;
import com.epapps.fakemarketplace.dto.MessageResDto;
import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.services.IMessageService;
import com.epapps.fakemarketplace.services.IProductService;
import com.epapps.fakemarketplace.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MessageController {

    private IMessageService messageService;
    private IUserService userService;

    public MessageController(IMessageService messageService, IUserService userService) {
        this.messageService = messageService;
        this.userService = userService;
    }

    @GetMapping("/messages")
    List<Message> getAll(){
        return this.messageService.getAll();
    }

    @GetMapping("/products/{id}/messages")
    List<Message> getProductMessages(@PathVariable Long id){
        return messageService.findByProduct(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/messages")
    MessageResDto createMessage(@RequestBody MessageRequestDto messageRequestDto){
        //var authUser = getAuthUser();
        return messageService.create(messageRequestDto);
    }

    private User getAuthUser(){
        return userService.getById(1L);
    }
}
