package org.gcomercial.gestioncommerciale.mapper;

import org.gcomercial.gestioncommerciale.dto.*;
import org.gcomercial.gestioncommerciale.entity.*;

public interface IGCMapper {
    LivraisonDTO fromBonLivraison(Livraison bonLivraison);
    Livraison formBnLivraisonDTO(LivraisonDTO bonLivraisonDTO);
    CategorieDTO fromCategorie(Categorie categorie);
    Categorie fromCategorieDTO(CategorieDTO categorieDTO);
    ClientDTO fromClient(Client client);
    Client fromClientDTO(ClientDTO clientDTO);
    CommandeDTO fromCommande(Commande commande);
    Commande fromCommandeDTO(CommandeDTO commandeDTO);
    DevisDTO fromDevis(Devis devis);
    Devis fromDevisDTO(DevisDTO devisDTO);
    EntrepriseDTO fromEntreprise(Entreprise entreprise);
    Entreprise fromEntrepriseDTO(EntrepriseDTO entrepriseDTO);
    FactureDTO fromFacture(Facture facture);
    Facture fromFactureDTO(FactureDTO factureDTO);
    FicheVenteDTO fromFicheVente(FicheVente ficheVente);
    FicheVente fromFicheVenteDTO(FicheVenteDTO ficheVenteDTO);
    LigneCommandeDTO fromLigneCommande(LingeCommande lingeCommande);
    LingeCommande fromLigneCommande(LigneCommandeDTO ligneCommandeDTO);
    ModalitepaymentDTO fromModalitePayment(ModalitePayment modalitePayment);
    ModalitePayment fromModalitePaymentDTO(ModalitepaymentDTO modamitepaymentDTO);
    ProduitDTO fromProduit(Produit produit);
    Produit fromProduitDTO(ProduitDTO produitDTO);
}
