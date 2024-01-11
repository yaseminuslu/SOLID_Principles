package dependencyInversion.best;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification(new Email());
        notification.sendMessage();
    }
}
