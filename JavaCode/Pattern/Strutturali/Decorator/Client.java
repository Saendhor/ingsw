package Decorator;

/* Client */
public class Client {
    public static void main(String[] args) {
        INotifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new Notifier("J Cole")));
        notifyAll.send("And I never did this before, no");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("J Cole"));
        notifyFbMail.send("You know that feeling");

    }
    
}
