package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;
import com.epapps.fakemarketplace.repositories.IMessageRepository;
import com.epapps.fakemarketplace.repositories.IProductRepository;
import com.epapps.fakemarketplace.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService implements IMessageService{

    private IMessageRepository messageRepository;
    private IProductRepository productRepository;
    private IUserRepository userRepository;


    public MessageService(IMessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getAll() {
        List<Message> comments = messageRepository.findAll();

        return comments;
    }

    @Override
    public List<Message> findByMoment(Long id) {
        List<Message> momentComments = new ArrayList<>();
        messageRepository.findByMomentId(id).forEach(momentComments::add);
        return momentComments;
    }

    @Override
    public Message create(Message message) {
        Product product = this.productRepository.findById(message.getProduct().getId()).get();
        User creator = this.userRepository.findById(message.getCreator().getId()).get();
        Message newMessage = new Message(message, product, creator);
        newMessage.setMessage(message.getMessage());
        newMessage.setCreator(message.getCreator());
        newMessage.setProduct(message.getProduct());

        this.messageRepository.save(newMessage);
        return newMessage;

    }
}
