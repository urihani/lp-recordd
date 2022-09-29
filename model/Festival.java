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
    public Festival(LocalDate dateDebut, LocalDate dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.programmes = new LinkedList<Programmation>();
        this.artistes = new LinkedList<Artiste>();
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
     * Recupere la liste des artistes du festival
     * @return LinkedList<Artiste>
     */
    public LinkedList<Artiste> getArtistes() {
        return artistes;
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

    /**
     * Récupere un programme du festival en fonction du nom de l'artiste
     * @return Programmation
     */
    public Programmation getProgramme(String pseudoArtiste) {
        for (Programmation programme : this.programmes) {
                if(programme.getArtiste().getPseudonyme().equals(pseudoArtiste)) {
                    return programme;
                }
        }
        return null;
    }

    /**
     * Ajouter un artiste au festival
     * @return void
     */
    public void addArtiste(Artiste artiste) {
        this.artistes.add(artiste);
    }
}