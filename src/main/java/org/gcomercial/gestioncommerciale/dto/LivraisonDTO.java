package org.gcomercial.gestioncommerciale.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LivraisonDTO {
    private Long id;
    private Date dateLivraison;
    private boolean statusDeLivraison;
    @OneToMany
    private FactureDTO produitLivre;
}

