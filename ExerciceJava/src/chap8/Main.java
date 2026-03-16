package chap8;
public class Main {

    public static void main(String[] args) {

        Employe[] employes = new Employe[3];

        employes[0] = new EmployeTempsPlein("Alice", 3000);
        employes[1] = new EmployeFreelance("Bob", 80, 40);
        employes[2] = new EmployeFreelance("Charlie", 50, 60);

        for (Employe e : employes) {
            System.out.println(e.getNom() + " gagne : " + e.calculerSalaire() + " €");
        }
    }
}