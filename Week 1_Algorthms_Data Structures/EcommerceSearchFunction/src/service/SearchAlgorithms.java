package service;

import model.Product;
import java.util.Arrays;

public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, String searchKey) {
        for (Product product : products) {
            if (product.getProductId().equals(searchKey) ||
                    product.getProductName().equalsIgnoreCase(searchKey)) {
                return product;
            }
        }
        return null; // Not found
    }

    // Binary Search (requires sorted array)
    public static Product binarySearch(Product[] products, String searchKey) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(searchKey) ||
                    midProduct.getProductName().equalsIgnoreCase(searchKey)) {
                return midProduct;
            }

            if (searchKey.compareTo(midProduct.getProductId()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Not found
    }

    // Utility method to sort products by ID (for binary search)
    public static void sortById(Product[] products) {
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
    }
}
