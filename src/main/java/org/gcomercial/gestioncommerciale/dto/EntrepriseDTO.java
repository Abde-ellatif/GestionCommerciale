package org.gcomercial.gestioncommerciale.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EntrepriseDTO {
    private String nameEntreprise;
    @Column(unique = true)
    private Long ice;
    private String fomeJuridique;
    private String sciegeSociale;
    private String image;
}
