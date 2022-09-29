package model;

import java.util.*;

/**
 * 
 */
public abstract class Evenement {

    /**
     * id de l'evenement
     */
    private UUID id;

    /**
     * nom de l'evenement
     */
    private String nom;

    /**
     * adresse de l'événement
     */
    private String adresse;

    /**
     * Default constructor
     */
    public Evenement(String nom) {
        this.id = UUID.randomUUID();
        this.nom = nom;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}