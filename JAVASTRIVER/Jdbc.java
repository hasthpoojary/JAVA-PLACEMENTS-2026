import java.sql.*;
import java.util.Scanner;

public class Jdbc {

    static final String URL = "jdbc:mysql://localhost:3306/hasth";
    static final String USER = "root";
    static final String PASSWORD = " ";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void insertPerson(Scanner sc) {
        try {
            Connection con = getConnection();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            String sql = "INSERT INTO person(name,email) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void viewPersons() {
        try {
            Connection con = getConnection();

            String sql = "SELECT * FROM person";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n-----------------------------------------------");
            System.out.printf("%-5s %-15s %-25s\n",
                    "ID", "NAME", "EMAIL");
            System.out.println("-----------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-5d %-15s %-25s\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
            }

            System.out.println("-----------------------------------------------");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void updatePerson(Scanner sc) {
        try {
            Connection con = getConnection();

            System.out.print("Enter ID to Update: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Email: ");
            String email = sc.nextLine();

            String sql =
                    "UPDATE person SET name=?, email=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully!");
            else
                System.out.println("ID Not Found!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deletePerson(Scanner sc) {
        try {
            Connection con = getConnection();

            System.out.print("Enter ID to Delete: ");
            int id = Integer.parseInt(sc.nextLine());

            String sql = "DELETE FROM person WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted Successfully!");
            else
                System.out.println("ID Not Found!");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== PERSON MANAGEMENT SYSTEM =====");
            System.out.println("1. Insert Person");
            System.out.println("2. View Persons");
            System.out.println("3. Update Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    insertPerson(sc);
                    break;

                case 2:
                    viewPersons();
                    break;

                case 3:
                    updatePerson(sc);
                    break;

                case 4:
                    deletePerson(sc);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}