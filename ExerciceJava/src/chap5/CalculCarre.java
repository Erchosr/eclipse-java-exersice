package chap5;
public class CalculCarre {
	public static void main(String[] args) {
		
		int valeur1 = 2;
		int valeur2 = 5;
		int valeur3 = 10;
		
		System.out.println("Carré de " + valeur1 + " = " + carre(valeur1));
		System.out.println("Carré de " + valeur2 + " = " + carre(valeur2));
		System.out.println("Carré de " + valeur3 + " = " + carre(valeur3));
	}
	
	private static int carre(int nombre) {
		return nombre * nombre;
	}
}