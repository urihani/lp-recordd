
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Concert extends Evenement {

    /**
     * Default constructor
     */
    public Concert() {
    }

    /**
     * 
     */
    private LocalDate date;

    /**
     * 
     */
    private LocalDate heureDebut;

    /**
     * 
     */
    private LocalDate heureFin;

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