
import java.util.*;

class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class EmpMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Hasth", 25));
        employees.add(new Employee("Abhi", 30));
        employees.add(new Employee("Jathin", 35));
        employees.add(new Employee("Keethan", 22));
        employees.add(new Employee("Harshith", 29));
        employees.add(new Employee("Harsha", 28));

        employees.sort((e1, e2) -> {
            int nameComp = e1.name.compareTo(e2.name);

            if (nameComp != 0) {
                return nameComp;
            }

            return Integer.compare(e2.age, e1.age);
        });

        employees.forEach(Employee::display);
    }
}
