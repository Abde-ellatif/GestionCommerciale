package org.gcomercial.gestioncommerciale.service;

import org.gcomercial.gestioncommerciale.dto.CategorieDTO;
import org.gcomercial.gestioncommerciale.dto.CommandeDTO;
import org.gcomercial.gestioncommerciale.dto.EntrepriseDTO;
import org.gcomercial.gestioncommerciale.dto.ProduitDTO;
import org.gcomercial.gestioncommerciale.dto.req.ProduitReq;
import org.gcomercial.gestioncommerciale.entity.Categorie;
import org.gcomercial.gestioncommerciale.entity.Commande;
import org.gcomercial.gestioncommerciale.entity.Produit;
import org.gcomercial.gestioncommerciale.exception.CategorieException;
import org.gcomercial.gestioncommerciale.exception.ProduitException;

import java.util.List;

public interface IGCService {
    ProduitDTO createProduit(ProduitReq produitReq) throws CategorieException;
    ProduitDTO updateProduit(ProduitReq produitReq,Long id) throws CategorieException, ProduitException;
    List<Produit> getAllProduit() throws ProduitException;
    ProduitDTO getProduitById(Long id) throws ProduitException;
    void deleteProduit(Long id) throws ProduitException;

    CommandeDTO createCommande(CommandeDTO commandeDTO);
    CommandeDTO updateCommande(Commande commande,Long id);
    List<Commande> getAllCommande();
    void getCommandeById(Long id);
    void annulerCommande(Long id);

    EntrepriseDTO createEntreprise(EntrepriseDTO entrepriseDTO);
    EntrepriseDTO updateEntreprise(EntrepriseDTO entrepriseDTO,Long id);
    void getEntrepriseById(Long id);
    void deleteEntreprise(Long id);

    CategorieDTO createCategorie(CategorieDTO categorieDTO);
    CategorieDTO updateCategorie(CategorieDTO categorieDTO,Long id) throws CategorieException;
    Categorie getAllCategorie() throws CategorieException;
    CategorieDTO getCategorieById(Long id) throws CategorieException;
    void deleteCategorie(Long id) throws CategorieException;



}
