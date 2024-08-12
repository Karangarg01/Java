import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> studentList;

    public Main() {
        studentList = new ArrayList<>();
    }

    public void addStudent(String name) {
        studentList.add(name);
        System.out.println("Student " + name + " added successfully.");
    }

    public void removeStudent(String name) {
        if (studentList.contains(name)) {
            studentList.remove(name);
            System.out.println("Student " + name + " removed successfully.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayAllStudents() {
        System.out.println("List of Students:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main manager = new Main();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String addName = scanner.nextLine();
                    manager.addStudent(addName);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeStudent(removeName);
                    break;
                case 3:
                    manager.displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
