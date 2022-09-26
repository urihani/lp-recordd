package model;

import data.GENRE_MUSICAL;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Album {

    /**
     * Default constructor
     */
    public Album() {
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
    private LocalDate dateDeSortie;

    /**
     * 
     */
    private int nombreDeLike;

    /**
     * 
     */
    private GENRE_MUSICAL genre;

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