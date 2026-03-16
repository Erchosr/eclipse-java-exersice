package chap7;
public class EtudiantController {

    public String verifierAdmission(Etudiant etudiant) {

        if (etudiant.estAdmis()) {
            return "Admis";
        } else {
            return "Ajourné";
        }
    }
}