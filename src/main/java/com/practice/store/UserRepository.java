package com.practice.store;

import com.practice.store.entities.User;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
