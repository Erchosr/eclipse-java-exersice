package chap10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ===== Exercice 10.1 =====
        System.out.println("===== Exercice 10.1 =====");

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant("Alice", 20));
        etudiants.add(new Etudiant("Bob", 22));
        etudiants.add(new Etudiant("Charlie", 19));

        for (Etudiant e : etudiants) {
            System.out.println("Nom : " + e.getNom() + ", Age : " + e.getAge());
        }


        // ===== Exercice 10.2 =====
        System.out.println("\n===== Exercice 10.2 =====");

        List<Animal> animaux = new ArrayList<>();

        animaux.add(new Chien("Rex"));
        animaux.add(new Chat("Mimi"));
        animaux.add(new Chien("Rocky"));
        animaux.add(new Chat("Luna"));

        for (Animal animal : animaux) {
            animal.crier();
        }
    }
}