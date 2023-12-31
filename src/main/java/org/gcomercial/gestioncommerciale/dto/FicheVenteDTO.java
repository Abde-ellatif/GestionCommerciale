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
public class FicheVenteDTO {
    private Long id;
    @ManyToOne
    private ProduitDTO produit;
}
