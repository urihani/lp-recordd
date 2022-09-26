package model;

import java.util.*;

/**
 * 
 */
public class Label {

    /**
     * id du label
     */
    private UUID id;

    /**
     * nom du label
     */
    private String nom;

    /**
     * Default constructor
     */
    public Label() {
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
}