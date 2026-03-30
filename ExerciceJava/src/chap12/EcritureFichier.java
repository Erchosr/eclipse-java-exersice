package chap12;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EcritureFichier {

    public static void executer() {

        Scanner scanner = new Scanner(System.in);
        String fichier = "src/livres.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichier))) {

            for (int i = 1; i <= 3; i++) {
                System.out.print("Entrez le nom du livre " + i + " : ");
                String livre = scanner.nextLine();

                writer.write(livre);
                writer.newLine();
            }

            System.out.println("Les données ont été enregistrées avec succès.");

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }
}