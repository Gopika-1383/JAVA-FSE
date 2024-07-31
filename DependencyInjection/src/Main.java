import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject CustomerRepository into CustomerService via constructor
        CustomerService customerService = new CustomerService(customerRepository);

        // Use CustomerService to get customer details
        String customerDetails = customerService.getCustomerDetails("12345");
        System.out.println(customerDetails);
    }
}