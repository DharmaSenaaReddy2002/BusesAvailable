package com.BusReservationSystemO;
import com.BusReservationSystemO.Repository.UserRepository;
import com.BusReservationSystemO.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class UserService {

    @Autowired
     UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User login(String email, String password) {

        return userRepository.findByEmailAndPassword(email, password);


    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}

