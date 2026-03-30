package chap12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe permettant de lire un fichier CSV de livres.
 */
public class LectureCSV {

    public static void executer() {

        String fichier = "src/livres.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {

            String ligne;

            // 🔹 Ignorer la première ligne (en-tête)
            reader.readLine();

            while ((ligne = reader.readLine()) != null) {

                // 🔹 Séparer les colonnes
                String[] parties = ligne.split(";");

                String titre = parties[0];
                String auteur = parties[1];

                // 🔹 Affichage simple
                System.out.println("Titre : " + titre + ", Auteur : " + auteur);

                // (optionnel) utiliser l'objet
                // System.out.println(livre.getTitre() + " - " + livre.getAuteur());
            }

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}