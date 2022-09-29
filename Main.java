import model.Artiste;
import model.Festival;
import model.Label;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // make an arraylist of Label
        ArrayList<Label> labels = new ArrayList<Label>();

        // fill the list with 4 labels
        for (int i = 0; i < 4; i++) {
            Label label = new Label();
            label.setId(java.util.UUID.randomUUID());
            label.setNom("Label " + i);
            labels.add(label);
        }

        // invite user to enter a name
        System.out.println("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // check if name is in the list
        for (Label label : labels) {
            if (label.getNom().equals(name)) {
                System.out.println("Found " + name);
                return;
            } else {
                System.out.println("Not found " + name);
            }
        }

        // show artists of the current label
        for (Label label : labels) {
            System.out.println("Artists of " + label.getNom());
            for (Artiste artiste : label.getArtistes()) {
                System.out.println(artiste.getNom());
            }
        }

        // show all labels
        for (Label label : labels) {
            System.out.println(label.getNom());
        }

        // print festivals of the current label
        for (Label label : labels) {
            System.out.println("Festivals of " + label.getNom());
            for (Festival festival : label.getFestivals()) {
                System.out.println(festival.getNom());
            }
        }
    }
}
