package chap10;

import java.util.*;

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

        for (Animal animal : animaux) {
            animal.crier();
        }


        // ===== Exercice 10.3 =====
        System.out.println("\n===== Exercice 10.3 =====");

        HashSet<Produit> produitsSet = new HashSet<>();
        produitsSet.add(new Produit("REF1", "Ordinateur", 1000));
        produitsSet.add(new Produit("REF2", "Souris", 20));
        produitsSet.add(new Produit("REF1", "Doublon", 999));

        System.out.println("Nombre de produits : " + produitsSet.size());

        for (Produit p : produitsSet) {
            System.out.println(p);
        }


        // ===== Exercice 10.4 =====
        System.out.println("\n===== Exercice 10.4 =====");

        List<Produit> produits = new ArrayList<>();

        produits.add(new Produit("REF1", "Ordinateur", 1000));
        produits.add(new Produit("REF2", "Souris", 20));
        produits.add(new Produit("REF3", "Clavier", 50));
        produits.add(new Produit("REF4", "Ecran", 200));

        System.out.println("Avant tri :");
        for (Produit p : produits) {
            System.out.println(p);
        }

        // Tri
        Collections.sort(produits);

        System.out.println("\nAprès tri :");
        for (Produit p : produits) {
            System.out.println(p);
        }
        
        Collections.sort(produits, new ProduitNomComparator());

        System.out.println("\nAprès tri par nom :");
        for (Produit p : produits) {
            System.out.println(p);
        }
    }
}