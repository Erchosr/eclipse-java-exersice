package chap7;
public class CompteController {

    public void deposerArgent(CompteBancaire compte, double montant) {
        compte.deposer(montant);
    }

    public void retirerArgent(CompteBancaire compte, double montant) {
        compte.retirer(montant);
    }
}