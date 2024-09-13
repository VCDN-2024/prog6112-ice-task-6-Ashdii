package edumanage;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

   public void PersonyInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

  public void displayInfo() {
  System.out.println("Name: " + name);
  System.out.println("Age: " + age);
  System.out.println("Email: " + email);
}
}
