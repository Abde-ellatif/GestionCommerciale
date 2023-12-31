package org.gcomercial.gestioncommerciale.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDevis;
    @ManyToOne
    private Produit produitsProposee;
    @ManyToOne
    private Client clinet;
}
