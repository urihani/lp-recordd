package model;

import java.time.LocalDate;

/**
 * 
 */
public class Festival extends Evenement {

    /**
     * date de début du festival
     */
    private LocalDate dateDebut;

    /**
     * date de fin du festival
     */
    private LocalDate dateFin;

    /**
     * Default constructor
     */
    public Festival() {
    }

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