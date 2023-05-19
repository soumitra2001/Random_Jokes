package com.geekster.Random_jokes.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jokeId;

    @Pattern(regexp = "[A-Z\\Da-z0-9]+")
    private String jokeType;

    @NotBlank
    @Column(unique = true)
    @Pattern(regexp = "[A-Za-z\\D0-9]+")
    private String jokeContent;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    public Joke(String joke, User user) {
        this.jokeContent=joke;
        this.user=user;
    }

}
