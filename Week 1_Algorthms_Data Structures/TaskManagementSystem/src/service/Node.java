package service;

import model.Task;

public class Node {
    Task task;
    Node next;

    // Constructor
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
