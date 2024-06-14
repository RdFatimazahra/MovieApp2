package org.movieapp.movieapp2.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FavoriteMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFovoriteMovie;

    @ManyToOne
    @JoinColumn(name = "idMovie")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Utilisateur utilisateur;
}