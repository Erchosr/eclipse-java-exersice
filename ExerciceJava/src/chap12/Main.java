package chap12;
public class Main {

    public static void main(String[] args) {

        System.out.println("===== Lecture du fichier =====");
        LectureFichier.executer();

        System.out.println("\n===== Écriture dans le fichier =====");
        EcritureFichier.executer();
        
        System.out.println("===== Lecture CSV =====");
        LectureCSV.executer();

        System.out.println("\nFin du programme.");
        
    }
}