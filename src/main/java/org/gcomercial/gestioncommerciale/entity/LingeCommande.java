package org.gcomercial.gestioncommerciale.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LingeCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Produit produitsCommandes;

}
