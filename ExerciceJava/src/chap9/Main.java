package chap9;

public class Main {

    public static void main(String[] args) {

        // ===== Exercice 9.1 =====
        System.out.println("===== Exercice 9.1 =====");

        Livre livre = new Livre(15.5);
        Boisson boisson = new Boisson(2.5);

        System.out.println("Prix du livre : " + livre.getPrix());
        System.out.println("Prix de la boisson : " + boisson.getPrix());


        // ===== Exercice 9.2 =====
        System.out.println("\n===== Exercice 9.2 =====");

        // Version Email
        MessageService emailService = new EmailService();
        NotificationService notification1 = new NotificationService(emailService);

        notification1.envoyer("Bonjour par email !");


        // Version SMS
        MessageService smsService = new SMSService();
        NotificationService notification2 = new NotificationService(smsService);

        notification2.envoyer("Bonjour par SMS !");
    }
}