package chap9;
public class EmailService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("Email envoyé : " + message);
    }
}