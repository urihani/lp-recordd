import common.SaisieMorceau;
import model.Artiste;
import model.Festival;
import model.Label;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            // Liste des labels présent dans l'application
            ArrayList<Label> labels = new ArrayList<Label>();
            labels.add(new Label("Sony"));

            // Création des date de début et de fin d'un festival
            LocalDate dateDebut = LocalDate.of(2020, 12, 12);
            LocalDate dateFin = LocalDate.of(2020, 12, 15);

            // Liste des festivals présent dans l'application
            ArrayList<Festival> festivals = new ArrayList<Festival>();
            festivals.add(new Festival("ldf", dateDebut, dateFin));

            // On créer un bollean pour vérifier que le label existe ou non
            boolean labelExist = false;

            // On créer une variable pour stocker le label connecté
            Label labelConnected = null;

            System.out.println("Bienvenue sur la plateforme pour gérer votre label. Veuillez entrer le nom de votre label :");
            Scanner sc = new Scanner(System.in);
            String nomLabel = sc.nextLine();
            // On vérifie que le label existe
            for (Label label : labels) {
                if (label.getNom().equals(nomLabel)) {
                    labelExist = true;
                    labelConnected = label;
                    break;
                }
                if (!labelExist) {
                    System.out.println("Le label n'existe pas.");
                }
            }
            while (labelExist) {
                // Le label est connecté, on lui demande ce qu'il veut faire
                System.out.println("Vous êtes connecté au label " + nomLabel + ". Que voulez-vous faire ?");
                System.out.println("1. Ajouter un artiste");
                System.out.println("2. Supprimer un artiste");
                System.out.println("3. Afficher la liste des artistes");
                System.out.println("4. Ajouter un artiste à un festival");
                System.out.println("5. Afficher un artiste présent à un festival");
                System.out.println("6. Se deconnecter");
                System.out.println("7. Ajouter un morceau");

                // On vérifie la valeur saisie par l'utilisateur
                String choixASaisir = sc.nextLine();
                int choix = Integer.parseInt(choixASaisir);

                while (choix < 1 || choix > 7) {
                    System.out.println("Veuillez entrer un choix valide :");
                    choix = sc.nextInt();
                }

                // On effectue les actions en fonction du choix de l'utilisateur
                switch (choix) {
                    case 1:
                        System.out.println("Vous avez choisi d'ajouter un artiste.");
                        System.out.println("Veuillez entrer le pseudonyme de l'artiste :");
                        String pseudonyme = sc.nextLine();
                        System.out.println("Veuillez entrer le nom de l'artiste :");
                        String nom = sc.nextLine();
                        System.out.println("Veuillez entrer le prénom de l'artiste :");
                        String prenom = sc.nextLine();
                        System.out.println("Veuillez entrer le mail de l'artiste");
                        String mail = sc.nextLine();
                        System.out.println("Veuillez entrer le numéro de téléphone de l'artiste :");
                        String telephone = sc.nextLine();
                        System.out.println("Veuillez entrer le nombre d'auditeurs de l'artiste");
                        String nbAuditeurs = sc.nextLine();

                        // Créer un nouvel artiste avec toutes ces informations
                        Artiste artiste = new Artiste(pseudonyme, nom, prenom, mail, telephone, nbAuditeurs);
                        // Ajouter l'artiste au label
                        labelConnected.addArtiste(artiste);

                        System.out.println("L'artiste a bien été ajouté.");

                        break;
                    case 2:
                        System.out.println("Vous avez choisi de supprimer un artiste. Veuillez entrer le pseudonyme de l'artiste :");
                        String pseudonymeArtisteSupprimer = sc.nextLine();
                        // On vérifie que l'artiste est dans la liste des artistes du label
                        if (labelConnected.getArtiste(pseudonymeArtisteSupprimer) != null) {
                            labelConnected.removeArtiste(pseudonymeArtisteSupprimer);
                            System.out.println("L'artiste a bien été supprimé");
                        } else {
                            System.out.println("L'artiste n'existe pas dans votre label");
                        }
                        break;
                    case 3:
                        System.out.println("Vous avez choisi d'afficher la liste des artistes");
                        // On affiche la liste des artistes
                        for (Artiste artisteDuLabel : labelConnected.getArtistes()) {
                            System.out.println(artisteDuLabel.getPseudonyme());
                        }
                        break;
                    case 4:
                        System.out.println("Vous avez choisi d'ajouter un artiste à un festival. Veuillez entrer le pseudonyme de l'artiste :");
                        String pseudonymeArtiste = sc.nextLine();
                        // On vérifie que l'artiste est dans la liste des artistes du label
                        if (labelConnected.getArtiste(pseudonymeArtiste) != null) {
                            System.out.println("Veuillez entrer le nom du festival :");
                            String nomFestival = sc.nextLine();
                            // On vérifie que le festival existe
                            for (Festival festival : festivals) {
                                if (festival.getNom().equals(nomFestival)) {
                                    festival.addArtiste(labelConnected.getArtiste(pseudonymeArtiste));
                                    System.out.println("L'artiste a bien été ajouté au festival");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("L'artiste n'existe pas dans votre label");
                        }
                        break;
                    case 5:
                        System.out.println("Vous avez choisi d'afficher un artiste présent à un festival. Veuillez entrer le pseudonyme de l'artiste :");
                        String pseudonymeArtisteFestival = sc.nextLine();
                        // On vérifie que l'artiste est dans la liste des artistes du label
                        if (labelConnected.getArtiste(pseudonymeArtisteFestival) != null) {
                            System.out.println("Veuillez entrer le nom du festival :");
                            String nomFestival = sc.nextLine();
                            // On vérifie que le festival existe
                            for (Festival festival : festivals) {
                                if (festival.getNom().equals(nomFestival)) {
                                    for (Artiste artisteFestival : festival.getArtistes()) {
                                        if (artisteFestival.getPseudonyme().equals(pseudonymeArtisteFestival)) {
                                            System.out.println("L'artiste est présent au festival");
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            System.out.println("L'artiste n'existe pas dans votre label");
                        }
                        break;
                    case 6:
                        System.out.println("Vous avez choisi de vous déconnecter");
                        // On déconnecte le label
                        labelConnected = null;
                        labelExist = false;
                        break;
                    case 7:
                        SaisieMorceau.SaisirMorceau(labelConnected);
                        break;
                }

            }
        }
    }
}
