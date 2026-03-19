package chap10;
public abstract class Animal {

    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public abstract void crier();
}