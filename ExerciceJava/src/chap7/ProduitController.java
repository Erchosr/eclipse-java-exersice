package chap7;
public class ProduitController {

    public void appliquerRemiseProduit(Produit produit, double pourcentage) {
        produit.appliquerRemise(pourcentage);
    }
}