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
public class ClientDTO {
    private Long id;
    private String name;
    private boolean typeClient;
    @Column(unique = true)
    private Long ice;
    private Long telephone;
    private String adresse;
    private String email;


}
