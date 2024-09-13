package edumanage;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice Smith", 20, "alicesmith@example.com", "12345");

        // Create a Teacher object
        Teacher teacher1 = new Teacher("Bob Johnson", 35, "bobjohnson@example.com", "Math");

        // Print the student details
        System.out.println("Student Details:");
        student1.displayStudentInfo();

        // Print the teacher details
        System.out.println("\nTeacher Details:");
        teacher1.displayTeacherInfo();
    }
}