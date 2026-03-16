package chap7;
public class CompteBancaire {

    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
        }
    }

    public String getTitulaire() {
        return this.titulaire;
    }

    public double getSolde() {
        return this.solde;
    }
}