package com.practice.store;

import com.practice.store.entities.Address;
import com.practice.store.entities.User;
import com.practice.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
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

    UserRepository userRepository;
    private final EntityManager entityManager;

    public void addUserToDB(User user)
    {
        userRepository.save(user);
    }

    @Transactional
    public void showEntityStates()
    {
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("password")
                .build();

        if (entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");

        userRepository.save(user);

        if (entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient / Detached");

    }

    public void persistRelated() {
        var user = User.builder()
                .name("John Doe")
                .email("john.doe@example.com")
                .password("password")
                .build();

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);

        userRepository.save(user);
    }

    @Transactional
    public void demoFetch()
    {
        User user = userRepository.findById(9L).orElseThrow(()->new RuntimeException("Could not find user"));
        System.out.println("User: "+user.getName()+ "\n"+ "Address: "+user.getAddresses());
    }
}
