package com.epapps.fakemarketplace.services;

import com.epapps.fakemarketplace.models.User;
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
@SpringBootTest
class UserServiceTest {

    @Mock
    IUserRepository userRepository;

    @Test
    void getByIdReturnsAUser() {
        var userService = new UserService(userRepository);

        var user = new User();
        user.setId(1L);
        user.setUserName("user");

        Long id = 1L;

        Mockito.when(userRepository.findById(id)).thenReturn(Optional.of(user));

        var sut = userService.getById(id);

        assertThat (sut.getUserName(), equalTo(user.getUserName()));
    }

    @Test
    void findAllReturnsAListOfUsers() {
        var userService = new UserService(userRepository);

        var usersList = List.of(new User(), new User());

        Mockito.when(userRepository.findAll()).thenReturn(usersList);

        var sut = userService.findAll();

        assertThat (sut.size(), equalTo(2));
    }
}