
import java.util.Scanner;

class StudentDetails {

    int rollno, cgpa;
    String name;

    StudentDetails(int rollno, String name, int cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students:");
        int numberOfStudents = sc.nextInt();
        StudentDetails[] students = new StudentDetails[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the details for student " + (i + 1));
            System.out.println("Enter Roll No:");
            int rollno = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter CGPA:");
            int cgpa = sc.nextInt();
            students[i] = new StudentDetails(rollno, name, cgpa);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1));
            students[i].display();
        }
    }
}
