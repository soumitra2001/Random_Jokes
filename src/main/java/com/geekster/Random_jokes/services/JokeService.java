package com.geekster.Random_jokes.services;

import com.geekster.Random_jokes.models.Joke;
import com.geekster.Random_jokes.models.User;
import com.geekster.Random_jokes.repositories.IJokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokeService {

    @Autowired
    private IJokeRepo jokeRepo;
    public boolean saveJoke(String joke, User user) {
        Joke myJoke=new Joke(joke,user);

        jokeRepo.save(myJoke);
        return true;
    }

    public String getRandomJoke(){
        List<Joke> jokes=jokeRepo.findAll();
        int idx= (int) (Math.random() * ((jokes.size() - 1) + 1));

        Joke joke=jokes.get(idx);
        return joke.getJokeContent();
    }

    public List<Joke> findUserJokes(User user) {
        List<Joke> jokes=jokeRepo.findByUser(user);

        return jokes;
    }
}
