package org.gcomercial.gestioncommerciale.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DevisDTO {
    private Long id;
    private Date dateDevis;
    @OneToMany
    private ProduitDTO produitsProposee;
    @ManyToOne
    private ClientDTO clinetDto;
}
