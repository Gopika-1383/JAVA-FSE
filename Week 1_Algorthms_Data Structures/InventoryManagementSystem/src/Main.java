import model.Product;
import service.InventoryManager;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product("P001", "Laptop", 10, 799.99));
        manager.addProduct(new Product("P002", "Smartphone", 25, 499.99));

        // List products
        System.out.println("Listing all products:");
        manager.listProducts();

        // Update product
        manager.updateProduct(new Product("P001", "Laptop", 8, 749.99));

        // Retrieve and print a specific product
        System.out.println("\nRetrieving product P001:");
        System.out.println(manager.getProduct("P001"));

        // Delete product
        manager.deleteProduct("P002");

        // List products again
        System.out.println("\nListing all products after deletion:");
        manager.listProducts();
    }
}