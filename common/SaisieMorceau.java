package common;

import data.GENRE_MUSICAL;
import model.Artiste;
import model.Label;
import model.Morceau;

public class SaisieMorceau {
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
    private static final GENRE_MUSICAL genreCourrant = null;

    public static Morceau SaisirMorceau(Label label) {
        Artiste artiste = saisirArtiste(label);
        String titre = saisirTitre();
        GENRE_MUSICAL genre = saisirGenre();
        String duree = saisirDuree();
        String dateDeSortie = saisirDateDeSortie();
        Morceau morceau = new Morceau(artiste, titre, duree, genre, dateDeSortie);
        // print morceau
        System.out.println(morceau);
        return morceau;
    }

    public static Artiste saisirArtiste(Label label) {
        // boucle sur les artistes avec un index
        // afficher l'index et le nom de l'artiste
        for (int i = 0; i < label.getArtistes().size(); i++) {
            System.out.println(i + " - " + label.getArtistes().get(i).getNom());
        }

        // si la liste est vide on demande de créer un artiste
        if (label.getArtistes().size() == 0) {
            System.out.println("Aucun artiste n'a été trouvé. Veuillez en créer un.");
            System.out.println("Not Implemented");
        }

        // on demande à l'utilisateur de saisir l'index de l'artiste
        System.out.println("Veuillez saisir l'index de l'artiste :");
        String index = scanner.nextLine();

        // on retourne l'artiste correspondant à l'index
        return label.getArtistes().get(Integer.parseInt(index));
    }

    public static String saisirTitre() {
        // invite user to enter a name
        System.out.println("Entrez un titre: ");
        String titre = scanner.nextLine();
        System.out.println("====================================");
        return titre;
    }

    public static GENRE_MUSICAL saisirGenre() {
        // invite user to enter a genre
        System.out.println("Entrez un genre: ");

        // boucle sur les genres
        for (int i = 0; i < GENRE_MUSICAL.values().length; i++) {
            System.out.println(i + " - " + GENRE_MUSICAL.values()[i]);
        }

        // invite user to enter a genre
        int genre = scanner.nextInt();

        // tant que le genre n'est pas valide
        while (genre < 0 || genre > GENRE_MUSICAL.values().length) {
            System.out.println("Entrez un genre valide: ");
            genre = scanner.nextInt();
        }

        switch (genre) {
            case 0:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.RAP);
                return GENRE_MUSICAL.RAP;
            case 1:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.ROCK);
                return GENRE_MUSICAL.ROCK;
            case 2:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.POP);
                return GENRE_MUSICAL.POP;
            case 3:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.COUNTRY);
                return GENRE_MUSICAL.COUNTRY;
            case 4:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.BLUES);
                return GENRE_MUSICAL.BLUES;
            case 5:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.ELECTRO);
                return GENRE_MUSICAL.ELECTRO;
            case 6:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.HOUSE);
                return GENRE_MUSICAL.HOUSE;
            case 7:
                System.out.println("Vous avez choisi le genre " + GENRE_MUSICAL.DRUMNBASS);
                return GENRE_MUSICAL.DRUMNBASS;
            default:
                System.out.println("Vous n'avez pas choisi un genre valide");
                return null;
        }
    }

    public static String saisirDuree() {
        // invite user to enter a duration
        System.out.println("Entrez une durée au format hh:mm:ss ");
        String duree = scanner.nextLine();
        // verifier si la duree est au bon format
        // si oui, creer un morceau
        // si non, afficher un message d'erreur
        while (!duree.matches("\\d{2}:\\d{2}:\\d{2}")) {
            System.out.println("La durée n'est pas au bon format");
            // invite user to enter a duration
            System.out.println("Entrez une durée au format hh:mm:ss ");
            duree = scanner.nextLine();
        }
        System.out.println("====================================");
        return duree;
    }

    public static String saisirDateDeSortie() {
        // invite user to enter dateSortie
        System.out.println("Entrez une date de sortie au format yyyy-mm-dd ");
        String dateDeSortie = scanner.nextLine();
        // verifier si la date de sortie est au bon format
        while (!dateDeSortie.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("La date de sortie n'est pas au bon format");
            // invite user to enter a duration
            System.out.println("Entrez une date de sortie au format yyyy-mm-dd ");
            dateDeSortie = scanner.nextLine();
        }
        System.out.println("====================================");
        return dateDeSortie;
    }

    public static GENRE_MUSICAL getGenreCourrant() {
        return genreCourrant;
    }

    public static void setGenreCourrant(GENRE_MUSICAL genreCourrant) {
        genreCourrant = genreCourrant;
    }
}
