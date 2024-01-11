package dependencyInversion.best;

public class Email implements Message{
    @Override
    public void sendMessage() {
        sendEmail();
    }
    public void sendEmail() {
        System.out.println("Email send successfully.");
    }
}
