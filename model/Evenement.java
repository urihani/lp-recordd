package model;

import java.util.*;

/**
 * 
 */
public abstract class Evenement {

    /**
     * Default constructor
     */
    public Evenement() {
    }

    /**
     * 
     */
    private UUID id;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String adresse;

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