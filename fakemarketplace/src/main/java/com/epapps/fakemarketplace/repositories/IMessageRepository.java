package com.epapps.fakemarketplace.repositories;

import com.epapps.fakemarketplace.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMessageRepository extends JpaRepository <Message, Long> {
    @Query("select m from Message m where m.product.id = :id")
    List<Message> findByMomentId(@Param("id")Long id);
}
