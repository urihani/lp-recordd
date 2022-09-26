package model;

import java.time.LocalDate;

/**
 * 
 */
public class Festival extends Evenement {

    /**
     * Default constructor
     */
    public Festival() {
    }

    /**
     * 
     */
    private LocalDate dateDebut;

    /**
     * 
     */
    private LocalDate dateFin;

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}