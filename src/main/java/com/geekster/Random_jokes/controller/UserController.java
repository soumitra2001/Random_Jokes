package com.geekster.Random_jokes.controller;

import com.geekster.Random_jokes.models.Joke;
import com.geekster.Random_jokes.models.User;
import com.geekster.Random_jokes.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String userSignUp(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/joke/{id}")
    public String addJoke(@PathVariable Long id,@RequestParam String joke){
        return userService.addJoke(id,joke);
    }

    @GetMapping("/randomJoke")
    public String getRandomJoke(){
        return userService.getAJoke();
    }

    @GetMapping("/myJokes/{id}")
    public ResponseEntity<List<Joke>> getMyJokes(@PathVariable Long id){
        List<Joke> jokes=userService.getMyJokes(id);

        return new ResponseEntity<>(jokes,jokes.isEmpty()? HttpStatus.NO_CONTENT:HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.allUser();
    }

}
