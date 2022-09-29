package model;

import java.time.LocalDate;

/**
 * 
 */
public class Concert extends Evenement {

    /**
     * date du concert
     */
    private LocalDate date;

    /**
     * heure du concert
     */
    private LocalDate heureDebut;

    /**
     * heure de fin du concert
     */
    private LocalDate heureFin;

    /**
     * Default constructor
     */
    public Concert() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalDate heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalDate getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalDate heureFin) {
        this.heureFin = heureFin;
    }
}