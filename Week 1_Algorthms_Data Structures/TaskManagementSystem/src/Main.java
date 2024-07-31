import model.Task;
import service.TaskList;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        // Add Tasks
        taskList.addTask(new Task("T001", "Design Database", "Pending"));
        taskList.addTask(new Task("T002", "Implement API", "In Progress"));
        taskList.addTask(new Task("T003", "Test Application", "Completed"));

        // Traverse Tasks
        System.out.println("Task List:");
        taskList.traverseTasks();

        // Search for a Task
        System.out.println("\nSearching for Task ID T002:");
        Task task = taskList.searchTaskById("T002");
        System.out.println(task != null ? task : "Task not found.");

        // Delete a Task
        System.out.println("\nDeleting Task ID T001:");
        taskList.deleteTaskById("T001");

        // Traverse Tasks Again
        System.out.println("\nTask List After Deletion:");
        taskList.traverseTasks();
    }
}