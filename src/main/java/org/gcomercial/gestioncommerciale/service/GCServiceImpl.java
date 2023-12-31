package org.gcomercial.gestioncommerciale.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
import org.gcomercial.gestioncommerciale.mapper.IGCMapper;
import org.gcomercial.gestioncommerciale.repo.CategorieRepo;
import org.gcomercial.gestioncommerciale.repo.ProduitRepo;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class GCServiceImpl implements IGCService{
    IGCMapper igcMapper;

    ProduitRepo produitRepo;
    @Override
    public ProduitDTO createProduit(ProduitReq produitReq) throws CategorieException {
        Optional<Categorie> categorie = categorieRepo.findById(produitReq.getCategorieId());
        if (categorie.isPresent()){
            ProduitDTO produitDTO = new ProduitDTO();
            produitDTO.setDesignation(produitReq.getDesignation());
            produitDTO.setReferance(produitReq.getReferance());
            produitDTO.setTva(produitReq.getTva());
            produitDTO.setPrixHT(produitReq.getPrixHT());
            produitDTO.setQntite(produitReq.getQntite());
            produitDTO.setCategorie(igcMapper.fromCategorie(categorie.get()));
            Produit save = produitRepo.save(igcMapper.fromProduitDTO(produitDTO));
            return igcMapper.fromProduit(save);

        }
        else {
            throw new CategorieException("categorie not found");
        }
    }

    @Override
    public ProduitDTO updateProduit(ProduitReq produitReq, Long id) throws CategorieException, ProduitException {
        Produit produit= produitRepo.findById(id).orElse(null);
        if (produit==null){
            throw new ProduitException("produit not found");
        }
        Optional<Categorie> categorie = categorieRepo.findById(produitReq.getCategorieId());
        if (categorie.isPresent()){
            ProduitDTO produitDTO = new ProduitDTO();
            produitDTO.setDesignation(produitReq.getDesignation());
            produitDTO.setReferance(produitReq.getReferance());
            produitDTO.setTva(produitReq.getTva());
            produitDTO.setPrixHT(produitReq.getPrixHT());
            produitDTO.setQntite(produitReq.getQntite());
            produitDTO.setCategorie(igcMapper.fromCategorie(categorie.get()));
            Produit save = produitRepo.save(igcMapper.fromProduitDTO(produitDTO));
            return igcMapper.fromProduit(save);

        }
        else {
            throw new CategorieException("categorie not found");
        }
    }

    @Override
    public List<Produit> getAllProduit() throws ProduitException {

        return produitRepo.findAll();
    }

    @Override
    public ProduitDTO getProduitById(Long id) throws ProduitException {
        Produit produit = produitRepo.findById(id).orElseThrow(()->{
            return new ProduitException("Produit not found");
        });
        ProduitDTO produitDTO = igcMapper.fromProduit(produit);
        return produitDTO;


    }

    @Override
    public void deleteProduit(Long id) throws ProduitException {
        produitRepo.findById(id).orElseThrow(()-> new ProduitException("Produit not found"));
        produitRepo.deleteById(id);

    }

    @Override
    public CommandeDTO createCommande(CommandeDTO commandeDTO) {
        return null;
    }

    @Override
    public CommandeDTO updateCommande(Commande commande, Long id) {
        return null;
    }

    @Override
    public List<Commande> getAllCommande() {
        return null;
    }

    @Override
    public void getCommandeById(Long id) {

    }

    @Override
    public void annulerCommande(Long id) {

    }

    @Override
    public EntrepriseDTO createEntreprise(EntrepriseDTO entrepriseDTO) {
        return null;
    }

    @Override
    public EntrepriseDTO updateEntreprise(EntrepriseDTO entrepriseDTO, Long id) {
        return null;
    }

    @Override
    public void getEntrepriseById(Long id) {

    }

    @Override
    public void deleteEntreprise(Long id) {

    }

    CategorieRepo categorieRepo;
    @Override
    public CategorieDTO createCategorie(CategorieDTO categorieDTO) {
        Categorie categorie = categorieRepo.save(igcMapper.fromCategorieDTO(categorieDTO));
        return igcMapper.fromCategorie(categorie);
    }

    @Override
    public CategorieDTO updateCategorie(CategorieDTO  categorieDTO, Long id) throws CategorieException {
        Categorie categorie = categorieRepo.findById(id).orElse(null);
        if (categorie==null){
            throw new CategorieException("Categorie not found");
        }else {
            Categorie save = categorieRepo.save(igcMapper.fromCategorieDTO(categorieDTO));
            return igcMapper.fromCategorie(save);
        }
    }

    @Override
    public Categorie getAllCategorie() throws CategorieException {
        return null;
    }

    @Override
    public CategorieDTO getCategorieById(Long id) throws CategorieException {

        Categorie categorie = categorieRepo.findById(id).orElseThrow(()->new CategorieException("Categorie not found"));
        CategorieDTO categorieDTO = igcMapper.fromCategorie(categorie);
        return categorieDTO;
    }

    @Override
    public void deleteCategorie(Long id) throws CategorieException {
        categorieRepo.findById(id).orElseThrow(()-> new CategorieException("Categorie not found"));
        categorieRepo.deleteById(id);

    }
}
