package dependencyInversion.best;

public class Sms implements Message{
    @Override
    public void sendMessage() {
        sendSMS();
    }
    public void sendSMS() {
        System.out.println("Sms send successfully.");
    }
}