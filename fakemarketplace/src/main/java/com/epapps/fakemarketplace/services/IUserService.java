package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.User;

import java.util.List;

public interface IUserService {
    User getById(Long id);

    List<User> findAll();
}
