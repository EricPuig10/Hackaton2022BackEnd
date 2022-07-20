package com.epapps.fakemarketplace.controllers;


import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.services.IMessageService;
import com.epapps.fakemarketplace.services.IProductService;
import com.epapps.fakemarketplace.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MessageController {

    private IMessageService messageService;

    public MessageController(IMessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    List<Message> getAll(){
        return this.messageService.getAll();
    }

    @GetMapping("/products/{id}/messages")
    List<Message> getProductMessages(@PathVariable Long id){
        return messageService.findByMoment(id);
    }

    @PostMapping("/messages")
    Message createMessage(@RequestBody Message message){
        return messageService.create(message);
    }
}
