package chap9;
public class SMSService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}