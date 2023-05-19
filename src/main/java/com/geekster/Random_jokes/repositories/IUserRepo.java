package com.geekster.Random_jokes.repositories;

import com.geekster.Random_jokes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
