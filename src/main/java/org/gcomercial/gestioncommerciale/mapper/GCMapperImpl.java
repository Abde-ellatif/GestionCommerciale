package org.gcomercial.gestioncommerciale.mapper;


import org.gcomercial.gestioncommerciale.dto.*;
import org.gcomercial.gestioncommerciale.entity.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class GCMapperImpl implements IGCMapper{
    @Override
    public LivraisonDTO fromBonLivraison(Livraison bonLivraison) {
        LivraisonDTO bonLivraisonDTO=new LivraisonDTO();
        BeanUtils.copyProperties(bonLivraison,bonLivraisonDTO);
        bonLivraisonDTO.setProduitLivre(this.fromFacture(bonLivraison.getProduitLivre()));
        return bonLivraisonDTO;
    }

    @Override
    public Livraison formBnLivraisonDTO(LivraisonDTO bonLivraisonDTO) {
        Livraison bonLivraison = new Livraison();
        BeanUtils.copyProperties(bonLivraisonDTO,bonLivraison);
        bonLivraison.setProduitLivre(this.fromFactureDTO(bonLivraisonDTO.getProduitLivre()));
        return bonLivraison;
    }

    @Override
    public CategorieDTO fromCategorie(Categorie categorie) {
        CategorieDTO categorieDTO=new CategorieDTO();
        BeanUtils.copyProperties(categorie,categorieDTO);
        return categorieDTO;
    }

    @Override
    public Categorie fromCategorieDTO(CategorieDTO categorieDTO) {
        Categorie categorie=new Categorie();
        BeanUtils.copyProperties(categorieDTO,categorie);
        return categorie;
    }

    @Override
    public ClientDTO fromClient(Client client) {
        ClientDTO clientDTO=new ClientDTO();
        BeanUtils.copyProperties(client,clientDTO);
        return clientDTO;
    }

    @Override
    public Client fromClientDTO(ClientDTO clientDTO) {
        Client client=new Client();
        BeanUtils.copyProperties(clientDTO,client);
        return client;
    }

    @Override
    public CommandeDTO fromCommande(Commande commande) {
        CommandeDTO commandeDTO=new CommandeDTO();
        BeanUtils.copyProperties(commande,commandeDTO);
        commandeDTO.setClinetDto(this.fromClient(commande.getClient()));
        commandeDTO.setProduitsCommande(this.fromProduit(commande.getProduitsCommande()));
        return commandeDTO;
    }

    @Override
    public Commande fromCommandeDTO(CommandeDTO commandeDTO) {
        Commande commande=new Commande();
        BeanUtils.copyProperties(commandeDTO,commande);
        commande.setClient(this.fromClientDTO(commandeDTO.getClinetDto()));
        commande.setProduitsCommande(this.fromProduitDTO(commandeDTO.getProduitsCommande()));
        return commande;
    }

    @Override
    public DevisDTO fromDevis(Devis devis) {
        DevisDTO devisDTO=new DevisDTO();
        BeanUtils.copyProperties(devis,devisDTO);
        devisDTO.setClinetDto(this.fromClient(devis.getClinet()));
        devisDTO.setProduitsProposee(this.fromProduit(devis.getProduitsProposee()));
        return devisDTO;
    }

    @Override
    public Devis fromDevisDTO(DevisDTO devisDTO) {
        Devis devis=new Devis();
        BeanUtils.copyProperties(devisDTO,devis);
        devis.setClinet(this.fromClientDTO(devisDTO.getClinetDto()));
        devis.setProduitsProposee(this.fromProduitDTO(devisDTO.getProduitsProposee()));
        return devis;
    }

    @Override
    public EntrepriseDTO fromEntreprise(Entreprise entreprise) {
        EntrepriseDTO entrepriseDTO=new EntrepriseDTO();
        BeanUtils.copyProperties(entreprise,entrepriseDTO);
        return entrepriseDTO;
    }

    @Override
    public Entreprise fromEntrepriseDTO(EntrepriseDTO entrepriseDTO) {
        Entreprise entreprise=new Entreprise();
        BeanUtils.copyProperties(entrepriseDTO,entreprise);
        return entreprise;
    }

    @Override
    public FactureDTO fromFacture(Facture facture) {
        FactureDTO factureDTO=new FactureDTO();
        BeanUtils.copyProperties(facture,factureDTO);
        factureDTO.setClinet(this.fromClient(facture.getClinet()));
        factureDTO.setProduitsFacturee(this.fromProduit(facture.getProduitsFacturee()));
        factureDTO.setModalitepaymentDTO(this.fromModalitePayment(facture.getModalitePayment()));
        return factureDTO;
    }

    @Override
    public Facture fromFactureDTO(FactureDTO factureDTO) {
        Facture facture=new Facture();
        BeanUtils.copyProperties(factureDTO,facture);
        facture.setClinet(this.fromClientDTO(factureDTO.getClinet()));
        facture.setProduitsFacturee(this.fromProduitDTO(factureDTO.getProduitsFacturee()));
        facture.setModalitePayment(this.fromModalitePaymentDTO(factureDTO.getModalitepaymentDTO()));
        return facture;
    }

    @Override
    public FicheVenteDTO fromFicheVente(FicheVente ficheVente) {
        FicheVenteDTO ficheVenteDTO=new FicheVenteDTO();
        BeanUtils.copyProperties(ficheVente,ficheVenteDTO);
        ficheVenteDTO.setProduit(this.fromProduit(ficheVente.getProduit()));
        return ficheVenteDTO;
    }

    @Override
    public FicheVente fromFicheVenteDTO(FicheVenteDTO ficheVenteDTO) {
        FicheVente ficheVente=new FicheVente();
        BeanUtils.copyProperties(ficheVenteDTO,ficheVente);
        ficheVente.setProduit(this.fromProduitDTO(ficheVenteDTO.getProduit()));
        return ficheVente;
    }

    @Override
    public LigneCommandeDTO fromLigneCommande(LingeCommande lingeCommande) {
        LigneCommandeDTO ligneCommandeDTO = new LigneCommandeDTO();
        BeanUtils.copyProperties(lingeCommande,ligneCommandeDTO);
        ligneCommandeDTO.setProduitsCommandesDtos(this.fromProduit(lingeCommande.getProduitsCommandes()));
        return ligneCommandeDTO;
    }

    @Override
    public LingeCommande fromLigneCommande(LigneCommandeDTO ligneCommandeDTO) {
        LingeCommande lingeCommande = new LingeCommande();
        BeanUtils.copyProperties(ligneCommandeDTO,lingeCommande);
        lingeCommande.setProduitsCommandes(this.fromProduitDTO(ligneCommandeDTO.getProduitsCommandesDtos()));
        return lingeCommande;
    }

    @Override
    public ModalitepaymentDTO fromModalitePayment(ModalitePayment modalitePayment) {
        ModalitepaymentDTO modalitepaymentDTO = new ModalitepaymentDTO();
        BeanUtils.copyProperties(modalitePayment,modalitepaymentDTO);
        return modalitepaymentDTO;
    }

    @Override
    public ModalitePayment fromModalitePaymentDTO(ModalitepaymentDTO modalitepaymentDTO) {
        ModalitePayment modalitePayment = new ModalitePayment();
        BeanUtils.copyProperties(modalitepaymentDTO,modalitePayment);
        return modalitePayment;
    }

    @Override
    public ProduitDTO fromProduit(Produit produit) {
        ProduitDTO produitDTO = new ProduitDTO();
        BeanUtils.copyProperties(produit,produitDTO);
        produitDTO.setCategorie(this.fromCategorie(produit.getCategorie()));
        return produitDTO;
    }

    @Override
    public Produit fromProduitDTO(ProduitDTO produitDTO) {
        Produit produit = new Produit();
        BeanUtils.copyProperties(produitDTO, produit);
        produit.setCategorie(this.fromCategorieDTO(produitDTO.getCategorie()));
        return produit;
    }
}
