package chap9;
public class NotificationService {

    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void envoyer(String message) {
        messageService.send(message);
    }
}