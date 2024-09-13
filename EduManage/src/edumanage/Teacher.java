
package edumanage;

public class Teacher extends Person {
    private final String subject;

    public Teacher(String name, int age, String email, String subject) {
        super(name, age, email);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void displayTeacherInfo() {
        displayInfo();
    }
}
