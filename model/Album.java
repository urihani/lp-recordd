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
     * Default constructor
     */
    public Album() {
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