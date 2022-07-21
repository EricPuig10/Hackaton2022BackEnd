package com.epapps.fakemarketplace.mappers;

import com.epapps.fakemarketplace.controllers.ProductController;
import com.epapps.fakemarketplace.dto.MessageRequestDto;
import com.epapps.fakemarketplace.dto.MessageResDto;
import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.models.Product;
import com.epapps.fakemarketplace.models.User;

public class MessageMapper {

    public Message mapReqToComment(MessageRequestDto req, Product product, User creator){
        Message message = new Message();
        message.setMessage(req.getMessage());
        message.setProduct(product);
        message.setCreator(creator);
        return message;
    }


    public MessageResDto mapCommentToRes(Message message) {
        MessageResDto resDto = new MessageResDto();
        resDto.setId(message.getId());
        resDto.setProductId(message.getProduct().getId());
        resDto.setMessage(message.getMessage());
        resDto.setCreator( new UserMapper().mapUserToResDtoProduct(message.getCreator()));
        return resDto;
    }


}
