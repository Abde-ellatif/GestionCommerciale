package org.gcomercial.gestioncommerciale.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nameEntreprise;
    @Column(unique = true)
    private Long ice;
    private String fomeJuridique;
    private String sciegeSociale;
    private String image;
}
