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
public class ProduitDTO {
    private Long id;
    private String designation;
    private String referance;
    private double prixHT;
    private int tva;
    private int qntite;
    @ManyToOne
    private CategorieDTO categorie;


}
