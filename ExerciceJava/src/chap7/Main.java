package chap7;

public class Main {

    public static void main(String[] args) {

        // ===== Exercice 7.1 =====
        System.out.println("===== Exercice 7.1 =====");

        Etudiant etudiant = new Etudiant(12.5);
        EtudiantController etudiantController = new EtudiantController();

        String resultat = etudiantController.verifierAdmission(etudiant);

        System.out.println("Résultat : " + resultat);


        // ===== Exercice 7.2 =====
        System.out.println("\n===== Exercice 7.2 =====");

        Produit produit = new Produit("Ordinateur", 1000);
        ProduitController produitController = new ProduitController();

        produitController.appliquerRemiseProduit(produit, 10);

        System.out.println("Produit : " + produit.getNom());
        System.out.println("Prix après remise : " + produit.getPrix());
        
        // ===== Exercice 7.3 =====
        System.out.println("\n===== Exercice 7.3 =====");

        CompteBancaire compte = new CompteBancaire("Alice", 500);

        CompteController compteController = new CompteController();

        compteController.deposerArgent(compte, 200);
        compteController.retirerArgent(compte, 100);

        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde final : " + compte.getSolde());
    }
}