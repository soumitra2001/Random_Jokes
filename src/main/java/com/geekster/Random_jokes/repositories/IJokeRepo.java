package com.geekster.Random_jokes.repositories;

import com.geekster.Random_jokes.models.Joke;
import com.geekster.Random_jokes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IJokeRepo extends JpaRepository<Joke,Long> {

    List<Joke> findByUser(User user);
}
