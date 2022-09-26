package model;

import data.GENRE_MUSICAL;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 */
public class Morceau {

    /**
     * Default constructor
     */
    public Morceau() {
    }

    /**
     * 
     */
    private UUID id;

    /**
     * 
     */
    private String titre;

    /**
     * 
     */
    private LocalTime duree;

    /**
     * 
     */
    private GENRE_MUSICAL genre;

    /**
     * 
     */
    private LocalDate dateDeSortie;

    /**
     * 
     */
    private int nombreEcoute;

    /**
     * 
     */
    private int nombreLike;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public GENRE_MUSICAL getGenre() {
        return genre;
    }

    public void setGenre(GENRE_MUSICAL genre) {
        this.genre = genre;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public int getNombreEcoute() {
        return nombreEcoute;
    }

    public void setNombreEcoute(int nombreEcoute) {
        this.nombreEcoute = nombreEcoute;
    }

    public int getNombreLike() {
        return nombreLike;
    }

    public void setNombreLike(int nombreLike) {
        this.nombreLike = nombreLike;
    }
}