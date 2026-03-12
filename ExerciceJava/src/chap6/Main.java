package chap6;

public class Main {

    public static void main(String[] args) {

        // ===== Exercice 6.1 =====
        System.out.println("===== Exercice 6.1 =====");

        Livre livre = new Livre();
        livre.setTitre("Le Petit Prince");
        livre.setAuteur("Antoine de Saint-Exupéry");
        livre.setNombrePages(96);

        System.out.println("Titre du livre : " + livre.getTitre());


        // ===== Exercice 6.2 =====
        System.out.println("\n===== Exercice 6.2 =====");

        CompteBancaire compte = new CompteBancaire("Alice", 1000);

        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde : " + compte.getSolde());

        compte.setSolde(-200);

        System.out.println("Solde après tentative négative : " + compte.getSolde());
        
     // ===== Exercice 6.3 =====
        
        System.out.println("\n===== Exercice 6.3 =====");

        Etudiant etudiant = new Etudiant("Robin", "Jean", 20, 15.5);

        System.out.println(etudiant);
    }
}