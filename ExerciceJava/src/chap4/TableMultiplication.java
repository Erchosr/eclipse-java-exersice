package chap4;
import java.util.Scanner;

public class TableMultiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombre;
        char recommencer;

        do {

            System.out.print("Entrez un nombre entre 1 et 10 : ");
            nombre = scanner.nextInt();

            if (nombre >= 1 && nombre <= 10) {

                for (int i = 1; i <= 10; i++) {
                    System.out.println(nombre + " x " + i + " = " + (nombre * i));
                }

            } else {
                System.out.println("Nombre invalide. Veuillez entrer un nombre entre 1 et 10.");
            }

            System.out.print("Voulez-vous recommencer ? (o/n) : ");
            recommencer = scanner.next().charAt(0);

        } while (recommencer == 'o' || recommencer == 'O');

        scanner.close();
        System.out.println("Programme terminé.");
    }
}