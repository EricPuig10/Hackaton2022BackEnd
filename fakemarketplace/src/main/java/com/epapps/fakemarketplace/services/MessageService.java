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
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService implements IMessageService{

    private IMessageRepository messageRepository;
    private IProductRepository productRepository;
    private IUserRepository userRepository;


    public MessageService(IMessageRepository messageRepository, IProductRepository productRepository, IUserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }



    @Override
    public List<Message> getAll() {
        List<Message> comments = messageRepository.findAll();

        return comments;
    }

    @Override
    public List<Message> findByProduct(Long id) {
        List<Message> momentComments = new ArrayList<>();
        messageRepository.findByMomentId(id).forEach(momentComments::add);
        return momentComments;
    }

    @Override
    public MessageResDto create(MessageRequestDto messageRequestDto) {
        Product product = this.productRepository.findById(messageRequestDto.getProductId()).get();
        User creator = this.userRepository.findById(messageRequestDto.getUserId()).get();
        Message message = new MessageMapper().mapReqToComment(messageRequestDto, product, creator);


        this.messageRepository.save(message);
        return new MessageMapper().mapCommentToRes(message);

    }
}
