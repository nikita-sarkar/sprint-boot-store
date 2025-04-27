package com.practice.store.repositories;

import com.practice.store.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    @Modifying
    @Query("UPDATE User u SET u.password = :newPassword WHERE u.id>5")
    public void updatePassword(String newPassword);
}
