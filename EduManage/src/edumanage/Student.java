package edumanage;

public class Student extends Person {
    private final String studentID;

    public Student(String name, int age, String email, String studentID) {
        super(name, age, email); // Calls the constructor of the superclass Person
        this.studentID = studentID; // // Assign the value of the passed parameter to the instance variable  
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo() from the Person class
        System.out.println("Student ID: " + studentID);
    }

    public void displayStudentInfo() {
        displayInfo();
    }
}

