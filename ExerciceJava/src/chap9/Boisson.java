package chap9;
public class Boisson implements Vendable {

    private double prix;

    public Boisson(double prix) {
        setPrix(prix);
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}