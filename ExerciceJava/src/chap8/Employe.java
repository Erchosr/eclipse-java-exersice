package chap8;
public abstract class Employe {

    private String nom;

    public Employe(String nom) {
        setNom(nom);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double calculerSalaire();
}