package model;

import java.time.LocalDate;
import java.util.LinkedList;

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
     * Liste de programmes du festival
     */
    private LinkedList<Programmation> programmes;

    /**
     * Listes des artistes présents au festival
     */
    private LinkedList<Artiste> artistes;


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

    /**
     * Recuperer la liste des programmes du festival
     * @return LinkedList<Programmation>
     */
    public LinkedList<Programmation> getProgrammes() {
        return programmes;
    }

    /**
     * Ajouter un programme au festival
     * @return void
     */
    public void addProgramme(Programmation programme) {
        this.programmes.add(programme);
    }


}