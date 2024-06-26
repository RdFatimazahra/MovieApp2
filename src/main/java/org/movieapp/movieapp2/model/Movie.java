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

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int idMovie;
    private  String  titre;
    private String dateSortie;
    private  String genre;
    private  String  realisateur;
    private int note;

}