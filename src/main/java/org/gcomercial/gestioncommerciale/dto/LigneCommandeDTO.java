package org.gcomercial.gestioncommerciale.dto;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.gcomercial.gestioncommerciale.entity.Produit;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LigneCommandeDTO {
    private Long id;
    @OneToMany
    private ProduitDTO produitsCommandesDtos;
}
