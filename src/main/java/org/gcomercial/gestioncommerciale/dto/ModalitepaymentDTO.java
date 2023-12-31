package org.gcomercial.gestioncommerciale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.gcomercial.gestioncommerciale.enumm.ModalitePayment;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ModalitepaymentDTO {
    private ModalitePayment modalitePayment;
}
