package model;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Artiste {

    /**
     * id de l'artiste
     */
    private UUID id;

    /**
     * pseudo de l'artiste
     */
    private String pseudonyme;

    /**
     * nom de l'artiste
     */
    private String nom;

    /**
     * prenom de l'artiste
     */
    private String prenom;

    /**
     * mail de l'artiste
     */
    private String mail;

    /**
     * telephone de l'artiste
     */
    private String telephone;

    /**
     * nombre d'auditeurs
     */
    private int nombreAuditeurs;

    /**
     * date inscription
     */
    private LocalDate dateInscription;

    /**
     * Default constructor
     */
    public Artiste() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNombreAuditeurs() {
        return nombreAuditeurs;
    }

    public void setNombreAuditeurs(int nombreAuditeurs) {
        this.nombreAuditeurs = nombreAuditeurs;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }
}