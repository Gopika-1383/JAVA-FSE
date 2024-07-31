public class NotifierDecoraror implements Notifier{
    protected Notifier wrappedNotifier;

    public NotifierDecoraror(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
