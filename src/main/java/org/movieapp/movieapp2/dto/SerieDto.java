package org.movieapp.movieapp2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SerieDto {
    private int idSerie;
    private String titre;
    private String description;
    private String dateDebut;
    private String dateFin;
    private String createur;
}
