import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = getValidInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> searchStudent();
                case 6 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    // Add student record method
    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = getValidInt();

        if (isIdExists(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = getValidInt();

        sc.nextLine();
        System.out.print("Enter Email Address: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        students.add(new Student(id, name, age, email, phone, department));
        System.out.println("Student added successfully!");
    }

    // View Student Record Method
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.displayStudentRecords();
        }
    }

    // Update Student Record Method
    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = getValidInt();
        for (Student s : students) {
            if (s.getId() == id) {

                sc.nextLine();
                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Age: ");
                s.setAge(getValidInt());

                sc.nextLine();
                System.out.print("Enter New Email: ");
                s.setEmail(sc.nextLine());

                System.out.print("Enter New Phone Number: ");
                s.setPhoneNumber(sc.nextLine());

                System.out.print("Enter New Department: ");
                s.setDepartment(sc.nextLine());

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    // Delete Student Record Method
    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = getValidInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Search Student Record Method
    static void searchStudent() {
        System.out.println("\n1. Search by ID");
        System.out.println("2. Search by Name");
        System.out.print("Choose option: ");

        int option = getValidInt();

        if (option == 1) {
            System.out.print("Enter Student ID: ");
            int id = getValidInt();

            for (Student s : students) {
                if (s.getId() == id) {
                    s.displayStudentRecords();
                    return;
                }
            }
            System.out.println("Student not found!");

        } else if (option == 2) {
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            boolean found = false;
            for (Student s : students) {
                if (s.getName().equalsIgnoreCase(name)) {
                    s.displayStudentRecords();
                    found = true;
                }
            }

            if (!found)
                System.out.println("Student not found!");
        } else {
            System.out.println("Invalid option!");
        }
    }

    // Input Validation Method
    static int getValidInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    // Duplicate ID Check Method 
    static boolean isIdExists(int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return true;
        }
        return false;
    }
}
