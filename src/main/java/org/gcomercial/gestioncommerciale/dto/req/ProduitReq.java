package org.gcomercial.gestioncommerciale.dto.req;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.gcomercial.gestioncommerciale.dto.CategorieDTO;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProduitReq {

    private String designation;
    private String referance;
    private double prixHT;
    private int tva;
    private int qntite;
    private Long categorieId;
}
