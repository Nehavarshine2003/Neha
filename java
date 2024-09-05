// Define the Student class
public class Student {
    // Define the variables
    String name;
    int roll_no;

    // Constructor to initialize the variables
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
    }

    // Main method to create an object and assign values
    public static void main(String[] args) {
        // Create an object of the Student class with the name "John" and roll_no 2
        Student student = new Student("John", 2);

        // Display the student's information
        student.displayInfo();
    }
}
