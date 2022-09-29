package model;

import data.GENRE_MUSICAL;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

/**
 *
 */
public class Morceau {

    /**
     * id du morceau
     */
    private UUID id;

    /**
     * titre du morceau
     */
    private String titre;

    /**
     * durée du morceau
     */
    private LocalTime duree;

    /**
     * genre du morceau
     */
    private GENRE_MUSICAL genre;

    /**
     * date de sortie du morceau
     */
    private LocalDate dateDeSortie;

    /**
     * date d'ajout du morceau
     */
    private final LocalDate dateAjout;

    /**
     * nombre ecoute du morceau
     */
    private int nombreEcoute;

    /**
     * nombre de like du morceau
     */
    private int nombreLike;

    /**
     * Default constructor
     */
    public Morceau(String titre, String duree, GENRE_MUSICAL genre, String dateDeSortie) {
        this.id = UUID.randomUUID();
        this.titre = titre;
        this.duree = LocalTime.parse(duree);
        this.genre = genre;
        this.dateDeSortie = LocalDate.parse(dateDeSortie);
        this.dateAjout = LocalDate.now();
        this.nombreEcoute = 0;
        this.nombreLike = 0;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public GENRE_MUSICAL getGenre() {
        return genre;
    }

    public void setGenre(GENRE_MUSICAL genre) {
        this.genre = genre;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public int getNombreEcoute() {
        return nombreEcoute;
    }

    public void setNombreEcoute(int nombreEcoute) {
        this.nombreEcoute = nombreEcoute;
    }

    public int getNombreLike() {
        return nombreLike;
    }

    public void setNombreLike(int nombreLike) {
        this.nombreLike = nombreLike;
    }

    @Override
    public String toString() {
        return "Morceau{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", duree=" + duree +
                ", genre=" + genre +
                ", dateDeSortie=" + dateDeSortie +
                ", dateAjout=" + dateAjout +
                ", nombreEcoute=" + nombreEcoute +
                ", nombreLike=" + nombreLike +
                '}';
    }
}