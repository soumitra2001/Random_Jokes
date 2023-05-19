package com.geekster.Random_jokes.services;

import com.geekster.Random_jokes.models.Joke;
import com.geekster.Random_jokes.models.User;
import com.geekster.Random_jokes.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepo userRepo;

    @Autowired
    private JokeService jokeService;
    public String saveUser(User user) {
        User myUser=userRepo.save(user);

        return "Account created successfully..!!";
    }

    public String addJoke(Long id, String joke) {
        //First check the given id is present in DB or not

        List<User> users=userRepo.findAll();

        for(User user:users){
            if(user.getUserId().equals(id)){
                if(jokeService.saveJoke(joke,user))
                    return "User joke successfully posted..!!";

                return "Joke has not been posted..!!";
            }
        }

        return "Invalid user input...!!";
    }

    public String getAJoke() {
        return jokeService.getRandomJoke();
    }

    public List<Joke> getMyJokes(Long id) {
        List<User> users=userRepo.findAll();
        List<Joke> jokes=null;
        for(User user:users){
            if(user.getUserId().equals(id)){
                jokes=jokeService.findUserJokes(user);
            }
        }
        return jokes;
    }

    public List<User> allUser() {
        return userRepo.findAll();
    }
}
