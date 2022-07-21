package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.dto.MessageRequestDto;
import com.epapps.fakemarketplace.dto.MessageResDto;
import com.epapps.fakemarketplace.models.Message;
import com.epapps.fakemarketplace.models.User;

import java.util.List;

public interface IMessageService {
    List<Message> getAll();


    List<Message> findByProduct(Long id);

    MessageResDto create(MessageRequestDto messageRequestDto);

}
