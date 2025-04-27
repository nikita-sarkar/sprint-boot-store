package com.practice.store.repositories;

import com.practice.store.dtos.UserNameDTO;
import com.practice.store.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    @Modifying
    @Query("UPDATE User u SET u.password = :newPassword WHERE u.id>5")
    public void updatePassword(String newPassword);

    @Query("select new com.practice.store.dtos.UserNameDTO(u.id, u.name) from User u where u.password = :password")
    List<UserNameDTO> findByPassword(@Param("password") String password);
}
