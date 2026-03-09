package chap4;
import java.util.Scanner;

public class AnalyseNombre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un nombre entier : ");
        int nombre = scanner.nextInt();

        // Analyse du signe
        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est nul.");
        }

        // Analyse pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }

        scanner.close();
    }
}