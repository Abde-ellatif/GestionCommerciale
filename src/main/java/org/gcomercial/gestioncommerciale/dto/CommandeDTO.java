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
public class CommandeDTO {
    private Long id;
    private Date dateCommande;
    @OneToMany
    private ProduitDTO produitsCommande;
    @ManyToOne
    private ClientDTO clinetDto;
}
