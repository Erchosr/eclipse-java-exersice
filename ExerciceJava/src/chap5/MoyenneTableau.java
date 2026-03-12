package chap5;
public class MoyenneTableau {

    public static void main(String[] args) {

        int[] notes = {20, 20, 1, 20, 20};

        double moyenne = calculerMoyenne(notes);

        System.out.println("La moyenne des notes est : " + moyenne);
    }
    
    private static double calculerMoyenne(int[] tableau) {
    	int somme = 0;
    	
    	for (int note : tableau) {
    		somme += note;
    	}
    	return (double) somme / tableau.length;
    }
}