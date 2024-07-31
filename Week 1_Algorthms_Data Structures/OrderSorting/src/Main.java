import model.Order;
import service.SortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 100.50),
                new Order("O002", "Charlie", 175.25)
        };

        // Bubble Sort Test
        System.out.println("Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reinitialize orders
        orders = new Order[]{
                new Order("O003", "Alice", 250.75),
                new Order("O001", "Bob", 100.50),
                new Order("O002", "Charlie", 175.25)
        };

        // Quick Sort Test
        System.out.println("\nQuick Sort:");
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}