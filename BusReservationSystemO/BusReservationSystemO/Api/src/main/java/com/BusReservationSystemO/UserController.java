package com.BusReservationSystemO;

import com.BusReservationSystemO.Entity.User;
import com.BusReservationSystemO.UserService;
import com.BusReservationSystemO.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return  userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.login(user.getEmail(), user.getPassword());


    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

}


