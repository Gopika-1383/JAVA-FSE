public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.00);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(300.00);
    }
}