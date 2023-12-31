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
public class FactureDTO {
    private Long id;
    private Date dateFacture;
    @OneToMany
    private ProduitDTO produitsFacturee;
    @ManyToOne
    private ClientDTO clinet;
    @Transient
    private ModalitepaymentDTO modalitepaymentDTO;
}
