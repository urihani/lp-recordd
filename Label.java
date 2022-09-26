
import java.util.*;

/**
 * 
 */
public class Label {

    /**
     * Default constructor
     */
    public Label() {
    }

    /**
     * 
     */
    private UUID id;

    /**
     * 
     */
    private String nom;

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
}