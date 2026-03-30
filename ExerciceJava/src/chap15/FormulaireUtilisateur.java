package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FormulaireUtilisateur extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ===== Création des labels et champs de saisie =====
        Label labelPrenom = new Label("Prénom :");
        TextField tfPrenom = new TextField();

        Label labelNom = new Label("Nom :");
        TextField tfNom = new TextField();

        Label labelAge = new Label("Âge :");
        TextField tfAge = new TextField();

        TextArea resultat = new TextArea();
        resultat.setEditable(false); // zone en lecture seule

        // ===== Boutons =====
        Button btnAfficher = new Button("Afficher");
        Button btnEffacer = new Button("Effacer");

        // ===== GridPane pour organiser les champs =====
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(labelPrenom, 0, 0);
        grid.add(tfPrenom, 1, 0);

        grid.add(labelNom, 0, 1);
        grid.add(tfNom, 1, 1);

        grid.add(labelAge, 0, 2);
        grid.add(tfAge, 1, 2);

        // ===== Gestion des événements =====
        btnAfficher.setOnAction(e -> {
            String prenom = tfPrenom.getText().trim();
            String nom = tfNom.getText().trim();
            String ageStr = tfAge.getText().trim();

            // Vérification des champs vides
            if (prenom.isEmpty() || nom.isEmpty() || ageStr.isEmpty()) {
                resultat.setText("Erreur : tous les champs doivent être remplis !");
                return;
            }

            // Vérification que l'âge est un nombre
            int age;
            try {
                age = Integer.parseInt(ageStr);
            } catch (NumberFormatException ex) {
                resultat.setText("Erreur : l'âge doit être un nombre entier !");
                return;
            }

            // Génération du message personnalisé
            String message = "Bonjour " + prenom + " " + nom + "\n" +
                             "Vous avez " + age + " ans.\n" +
                             "Bienvenue dans l'application.";
            resultat.setText(message);
        });

        btnEffacer.setOnAction(e -> {
            tfPrenom.clear();
            tfNom.clear();
            tfAge.clear();
            resultat.clear();
        });

        // ===== VBox pour regrouper GridPane + boutons + TextArea =====
        HBox boutons = new HBox(10, btnAfficher, btnEffacer);

        VBox root = new VBox(10, grid, boutons, resultat);
        root.setStyle("-fx-padding: 20;");

        // ===== Création de la scène =====
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Formulaire Utilisateur");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}