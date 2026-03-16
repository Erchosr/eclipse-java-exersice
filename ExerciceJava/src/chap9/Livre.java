package chap9;
public class Livre implements Vendable {

    private double prix;

    public Livre(double prix) {
        setPrix(prix);
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}