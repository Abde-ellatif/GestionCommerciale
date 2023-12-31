package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRepo extends JpaRepository<Devis,Long> {
}
