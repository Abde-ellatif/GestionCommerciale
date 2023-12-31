package org.gcomercial.gestioncommerciale.repo;

import org.gcomercial.gestioncommerciale.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepo extends JpaRepository<Entreprise,Long> {
}
