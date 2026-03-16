package chap7;
public class Etudiant {

    private double moyenne;

    public Etudiant(double moyenne) {
        this.moyenne = moyenne;
    }

    public double getMoyenne() {
        return this.moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public boolean estAdmis() {
        return this.moyenne >= 10;
    }
}