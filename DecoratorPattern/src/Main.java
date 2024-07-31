public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the email notifier with SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMS notifier with Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a notification using the decorated notifiers
        slackNotifier.send("Hello, this is a test notification!");

        // Output the notifications with only email and SMS
        Notifier emailAndSmsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSmsNotifier.send("This is another test notification!");
    }
}