public class Main {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdaptor(payPalGateway);
        payPalProcessor.processPayment(100.00);

        // Using Stripe payment gateway through adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdaptor(stripeGateway);
        stripeProcessor.processPayment(200.00);
    }
}