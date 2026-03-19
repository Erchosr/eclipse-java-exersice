package chap10;
import java.util.Comparator;

public class ProduitNomComparator implements Comparator<Produit> {
	
	@Override
	public int compare(Produit p1, Produit p2) {
		return p1.getNom().compareTo(p2.getNom());
	}
}