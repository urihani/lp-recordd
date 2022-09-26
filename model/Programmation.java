package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * 
 */
public class Programmation {

    /**
     * Default constructor
     */
    public Programmation() {
    }

    /**
     * 
     */
    private UUID id;

    /**
     * 
     */
    private LocalDate date;

    /**
     * 
     */
    private LocalTime heure;

    /**
     * 
     */
    private float DUREE;

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
}