import model.Student;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("1", "John Doe", "A");

        // Create a StudentView object
        StudentView view = new StudentView();

        // Create a StudentController object
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}