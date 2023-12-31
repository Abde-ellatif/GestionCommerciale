package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
