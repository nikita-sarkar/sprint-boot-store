package com.practice.store;

import com.practice.store.entities.User;
import com.practice.store.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    private final UserRepository userRepository;
//    private final NotificationService notificationService;
//
//    public UserService(UserRepository userRepository, NotificationService notificationService)
//    {
//        this.userRepository = userRepository;
//        this.notificationService = notificationService;
//    }
//
//    public void registerUser(User user)
//    {
//        if(userRepository.findByEmail(user.getEmail())!=null)
//        {
//            throw new IllegalArgumentException("User with" + user.getEmail() + " this email already exists");
//        }
//
//        userRepository.save(user);
//        notificationService.send("User registered successfully!", user.getEmail());
//    }

    @Autowired
    UserRepository userRepository;

    public void addUserToDB(User user)
    {
        userRepository.save(user);
    }
}
