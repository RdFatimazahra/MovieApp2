package org.movieapp.movieapp2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private int idMovie;
    private String titre;
    private String dateSortie;
    private String genre;
    private String realisateur;
    private int note;
}