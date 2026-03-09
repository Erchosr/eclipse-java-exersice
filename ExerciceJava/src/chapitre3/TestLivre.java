package chapitre3;

public class TestLivre {

    public static void main(String[] args) {

        Livre livre = new Livre("1984", "George Orwell");

        System.out.println("Livre emprunte ? " + livre.estEmprunte());

        livre.emprunter();
        System.out.println("Livre emprunte ? " + livre.estEmprunte());

        livre.rendre();
        System.out.println("Livre emprunte ? " + livre.estEmprunte());

    }

}