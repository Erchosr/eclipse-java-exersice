package chap9;
public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre(15.5);
        Boisson boisson = new Boisson(2.5);

        System.out.println("Prix du livre : " + livre.getPrix());
        System.out.println("Prix de la boisson : " + boisson.getPrix());
    }
}