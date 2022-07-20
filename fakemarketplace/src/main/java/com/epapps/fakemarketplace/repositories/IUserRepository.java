package com.epapps.fakemarketplace.repositories;

import com.epapps.fakemarketplace.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User, Long> {
}
