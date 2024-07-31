import model.Product;
import service.SearchAlgorithms;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P003", "Smartwatch", "Electronics"),
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics")
        };

        // Sort products for binary search
        SearchAlgorithms.sortById(products);

        // Linear Search Test
        System.out.println("Linear Search:");
        Product resultLinear = SearchAlgorithms.linearSearch(products, "P002");
        System.out.println(resultLinear != null ? resultLinear : "Product not found.");

        // Binary Search Test
        System.out.println("\nBinary Search:");
        Product resultBinary = SearchAlgorithms.binarySearch(products, "P001");
        System.out.println(resultBinary != null ? resultBinary : "Product not found.");
    }
}