package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.FicheVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheVentesRepo extends JpaRepository<FicheVente,Long> {
}
