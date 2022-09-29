package model;

import data.GENRE_MUSICAL;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Album {

    /**
     * id de l'album
     */
    private UUID id;

    /**
     * nom de l'album
     */
    private String nom;

    /**
     * date de sortie de l'album
     */
    private LocalDate dateDeSortie;

    /**
     * nombre de like de l'album
     */
    private int nombreDeLike;

    /**
     * genre de l'album
     */
    private GENRE_MUSICAL genre;

    /**
     * liste des morceaux de l'album
     */
    private List<Morceau> morceaux;

    /**
     * Liste des artistes de l'album 1..*
     */
    private HashMap<UUID, Artiste> artistes = new HashMap<>();


    /**
     * Default constructor
     */
    public Album(String nom, Artiste artiste, List<Morceau> morceaux, GENRE_MUSICAL genre) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.morceaux = morceaux;
        this.genre = genre;
        this.artistes.put(artiste.getId(), artiste);
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Morceau> getMorceaux() {
        return morceaux;
    }

    public void setMorceaux(List<Morceau> morceaux) {
        this.morceaux = morceaux;
    }

    public HashMap<UUID, Artiste> getArtistes() {
        return artistes;
    }

    public void setArtistes(HashMap<UUID, Artiste> artistes) {
        this.artistes = artistes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public int getNombreDeLike() {
        return nombreDeLike;
    }

    public void setNombreDeLike(int nombreDeLike) {
        this.nombreDeLike = nombreDeLike;
    }

    public GENRE_MUSICAL getGenre() {
        return genre;
    }

    public void setGenre(GENRE_MUSICAL genre) {
        this.genre = genre;
    }
}