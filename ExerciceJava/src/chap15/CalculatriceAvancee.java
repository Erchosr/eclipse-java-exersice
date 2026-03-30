package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalculatriceAvancee extends Application {

    private double premierNombre = 0;
    private String operation = "";
    private boolean nouvelleSaisie = true; // pour savoir si on commence un nouveau nombre

    @Override
    public void start(Stage primaryStage) {
        // ===== Champ d'affichage =====
        TextField affichage = new TextField();
        affichage.setEditable(false); // interdit la saisie clavier
        affichage.setPrefHeight(50);

        // ===== Création des boutons =====
        String[][] boutons = {
            {"7", "8", "9", "/"},
            {"4", "5", "6", "*"},
            {"1", "2", "3", "-"},
            {"0", ".", "+/-", "+"},
            {"C", "CE", "=", ""}
        };

        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);

        for (int i = 0; i < boutons.length; i++) {
            for (int j = 0; j < boutons[i].length; j++) {
                String texte = boutons[i][j];
                if (texte.isEmpty()) continue; // case vide

                Button btn = new Button(texte);
                btn.setPrefSize(60, 60);

                btn.setOnAction(e -> {
                    try {
                        switch (texte) {
                            case "C":
                                affichage.clear();
                                premierNombre = 0;
                                operation = "";
                                nouvelleSaisie = true;
                                break;
                            case "CE":
                                affichage.clear();
                                nouvelleSaisie = true;
                                break;
                            case "+/-":
                                if (!affichage.getText().isEmpty()) {
                                    if (affichage.getText().startsWith("-")) {
                                        affichage.setText(affichage.getText().substring(1));
                                    } else {
                                        affichage.setText("-" + affichage.getText());
                                    }
                                }
                                break;
                            case "+":
                            case "-":
                            case "*":
                            case "/":
                                premierNombre = Double.parseDouble(affichage.getText());
                                operation = texte;
                                nouvelleSaisie = true;
                                break;
                            case "=":
                                if (operation.isEmpty()) return;
                                double secondNombre = Double.parseDouble(affichage.getText());
                                double resultat = 0;
                                switch (operation) {
                                    case "+": resultat = premierNombre + secondNombre; break;
                                    case "-": resultat = premierNombre - secondNombre; break;
                                    case "*": resultat = premierNombre * secondNombre; break;
                                    case "/":
                                        if (secondNombre == 0) {
                                            affichage.setText("Erreur : /0");
                                            operation = "";
                                            nouvelleSaisie = true;
                                            return;
                                        }
                                        resultat = premierNombre / secondNombre;
                                        break;
                                }
                                // Affichage propre : si c'est un entier, pas de .0
                                if (resultat == (int) resultat) {
                                    affichage.setText(String.valueOf((int) resultat));
                                } else {
                                    affichage.setText(String.valueOf(resultat));
                                }
                                operation = "";
                                nouvelleSaisie = true;
                                break;
                            case ".":
                                if (nouvelleSaisie) {
                                    affichage.clear();
                                    affichage.setText("0.");
                                    nouvelleSaisie = false;
                                } else if (!affichage.getText().contains(".")) {
                                    affichage.appendText(".");
                                }
                                break;
                            default: // boutons numériques
                                if (nouvelleSaisie) {
                                    affichage.clear();
                                    nouvelleSaisie = false;
                                }
                                affichage.appendText(texte);
                                break;
                        }
                    } catch (NumberFormatException ex) {
                        affichage.setText("Erreur");
                        nouvelleSaisie = true;
                    }
                });

                grid.add(btn, j, i);
            }
        }

        // ===== Organisation générale =====
        VBox root = new VBox(10, affichage, grid);
        root.setStyle("-fx-padding: 20; -fx-background-color: #f0f0f0;");

        // CSS simple pour les boutons
        grid.getChildren().forEach(node -> {
            if (node instanceof Button b) {
                b.setStyle("-fx-font-size: 18px; -fx-background-color: #dcdcdc;");
            }
        });

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculatrice Avancée");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}