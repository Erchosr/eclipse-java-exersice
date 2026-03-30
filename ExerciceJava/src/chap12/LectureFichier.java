package chap12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectureFichier {

    public static void executer() {

        String fichier = "src/livres.txt";
        String notes = "src/notes.txt";
        int compteur = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {

            String ligne;

            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
                compteur++;
            }

            System.out.println("Nombre de lignes : " + compteur);

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : fichier introuvable !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier.");
        }
    }
}