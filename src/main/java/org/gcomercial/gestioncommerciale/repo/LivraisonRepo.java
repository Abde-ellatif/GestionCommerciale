package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivraisonRepo extends JpaRepository<Livraison,Long> {
}
