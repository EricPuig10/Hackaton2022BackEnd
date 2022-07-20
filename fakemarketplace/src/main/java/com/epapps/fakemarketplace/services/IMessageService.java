package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.Message;

import java.util.List;

public interface IMessageService {
    List<Message> getAll();


    List<Message> findByMoment(Long id);

    Message create(Message message);

}
