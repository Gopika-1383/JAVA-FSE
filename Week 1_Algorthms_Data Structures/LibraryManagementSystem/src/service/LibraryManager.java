package service;

import model.Book;
import java.util.Arrays;

public class LibraryManager {
    private Book[] books;

    // Constructor
    public LibraryManager(Book[] books) {
        this.books = books;
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    // Binary Search by Title (Requires Sorted Array)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].getTitle());

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null; // Not found
    }
        }
