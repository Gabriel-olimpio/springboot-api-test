package com.example.springapi.demo.service;
import com.example.springapi.demo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private List<User> userList;


    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Gabriel", 20, "gabriel@gmail.com");
        User user2 = new User(2, "Bill", 23, "bill@gmail.com");
        User user3 = new User(3, "Gret", 45, "gret@gmail.com");
        User user4 = new User(4, "Josh", 12, "josh@gmail.com");
        User user5 = new User(5, "Linda", 25, "linda@gmail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();

        for (User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;
    }

}
