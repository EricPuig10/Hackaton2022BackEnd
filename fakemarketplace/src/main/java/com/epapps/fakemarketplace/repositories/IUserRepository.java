package com.epapps.fakemarketplace.repositories;

import com.epapps.fakemarketplace.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserRepository extends JpaRepository <User, Long> {

}
