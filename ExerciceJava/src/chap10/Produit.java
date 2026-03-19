package chap10;

public class Produit implements Comparable<Produit> {

    private String reference;
    private String nom;
    private double prix;

    public Produit(String reference, String nom, double prix) {
        setReference(reference);
        setNom(nom);
        setPrix(prix);
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Tri naturel : prix croissant
    @Override
    public int compareTo(Produit autre) {
        return Double.compare(this.prix, autre.prix);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "reference='" + reference + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}