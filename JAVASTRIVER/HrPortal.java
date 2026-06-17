
import java.util.*;

class Employee {

    String name, dept, joindate;
    int id, salary;
    ArrayList<Employee> list = new ArrayList<Employee>();

    Employee(String name, int id, String dept, int salary, String joindate) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
        this.joindate = joindate;
    }

    void addemp(String name, int id, String dept, int salary, String joindate) {
        list.add(new Employee(name, id, dept, salary, joindate));
        System.out.println("Employee added successfully.");
    }

    void deleteemp(int id) {
        boolean found = false;

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();

            if (emp.id == id) {
                it.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    void display() {

        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee emp : list) {
            System.out.println("------------------------");
            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Employee Department: " + emp.dept);
            System.out.println("Employee Salary: " + emp.salary);
            System.out.println("Employee Join Date: " + emp.joindate);
        }
    }
}

public class HrPortal {

    public static void main(String[] args) {

        String name, dept, joindate;
        int id, salary, ch;

        Employee em = new Employee("", 0, "", 0, "");

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== HR PORTAL =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Department: ");
                    dept = sc.nextLine();
                    while (true) {
                        System.out.print("Enter Employee Salary: ");
                        salary = sc.nextInt();
                        if (salary > 0) {
                            break;
                        } else {
                            System.out.println("Salary must be greater than 0.");
                        }
                    }
                    sc.nextLine();
                    System.out.print("Enter Employee Join Date: ");
                    joindate = sc.nextLine();
                    em.addemp(name, id, dept, salary, joindate);
                    break;
                case 2:
                    System.out.println("\nEmployee Details:");
                    em.display();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    em.deleteemp(deleteId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
