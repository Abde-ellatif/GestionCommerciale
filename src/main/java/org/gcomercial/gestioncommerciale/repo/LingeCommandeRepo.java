package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.LingeCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LingeCommandeRepo extends JpaRepository<LingeCommande,Long> {
}
