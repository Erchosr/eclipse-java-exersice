package chap4;

public class ParcoursFiltrage {

    public static void main(String[] args) {

        int[] notes = {12, 8, 15, 3, 19, 7, 14, 5};

        for (int note : notes) {

            if (note < 5) {
                continue; 
            }

            if (note == 19) {
                System.out.println(note);
                break; 
            }

            if (note >= 10) {
                System.out.println(note);
            }
        }
    }
}