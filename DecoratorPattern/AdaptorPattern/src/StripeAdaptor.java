public class StripeAdaptor implements PaymentProcessor{
    private StripeGateway stripeGateway;

    public StripeAdaptor(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }
}
