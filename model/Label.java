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
     * liste des artistes du label
     */
    private LinkedList<Artiste> artistes;

    /**
     * Default constructor
     */
    public Label(String nom) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.artistes = new LinkedList<Artiste>();
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

    /**
     * Ajouter un artiste au label
     * @return LinkedList<Artiste>
     */
    public void addArtiste(Artiste artiste) {
        this.artistes.add(artiste);
    }

    /**
     * Supprimer un artiste du label en fonction de son pseudonyme
     * @return void
     */
    public void removeArtiste(String pseudonyme) {
        for (Artiste artiste : this.artistes) {
            if (artiste.getPseudonyme().equals(pseudonyme)) {
                this.artistes.remove(artiste);
                return;
            }
        }
    }

    /**
     * Recuperer un artiste du label en fonction de son pseudonyme
     * Si l'artiste n'existe pas, retourner null
     * @return Artiste
     */
    public Artiste getArtiste(String pseudonyme) {
        for (Artiste artiste : this.artistes) {
            if (artiste.getPseudonyme().equals(pseudonyme)) {
                return artiste;
            }
        }
        return null;
    }

    /**
     * Recuperer la liste des artistes du label
     * @return LinkedList<Artiste>
     */
    public LinkedList<Artiste> getArtistes() {
        return this.artistes;
    }
}