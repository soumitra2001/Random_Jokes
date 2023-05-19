package com.geekster.Random_jokes.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    @Pattern(regexp = "[A-Z][A-Za-z\\D]+")
    private String userName;

    @NotBlank
    @Email
    @Column(unique = true)
    private String userEmail;

    @JsonIgnore
    @OneToMany(cascade =CascadeType.MERGE,mappedBy = "")
    private List<Joke> jokes;

}
