package org.gcomercial.gestioncommerciale.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String designation;
    private String referance;
    private double prixHT;
    private int tva;
    private int qntite;
    @ManyToOne
    private Categorie categorie;


}
