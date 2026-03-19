package chap10;

public class Chien extends Animal {

    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(getNom() + " dit : Wouf !");
    }
}