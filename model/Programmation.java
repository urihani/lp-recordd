package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 */
public class Programmation {

    /**
     * id de la programmation
     */
    private UUID id;

    /**
     * date de la programmation
     */
    private LocalDate date;

    /**
     * Heure de début de la programmation
     */
    private LocalTime heure;

    /**
     * durée de la programmation
     */
    private float DUREE;

    /**
     * Artiste de la programmation
     */
    private Artiste artiste;

    /**
     * Festival de la programmation
     */
    private Festival festival;

    /**
     * Contructeur de la programmation
     */
    public Programmation(Artiste artiste, Festival festival) {
        addArtiste(artiste);
        addFestival(festival);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    public float getDUREE() {
        return DUREE;
    }

    public void setDUREE(float DUREE) {
        this.DUREE = DUREE;
    }

    /**
     * Recupere l'artiste lié à la programmation
     * @return Artiste
     */
    public Artiste getArtiste() {
        return this.artiste;
    }

    /**
     * Ajouter un artiste à la programmation
     * @return Artiste
     */
    public void addArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    /**
     * Ajouter un festival à la programmation
     */
    public void addFestival(Festival festival) {
        this.festival = festival;
    }



}