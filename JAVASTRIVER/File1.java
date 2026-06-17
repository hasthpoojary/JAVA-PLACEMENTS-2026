
import java.io.*;
import java.util.*;

class File1 {
    public static void main(String args[]) {

        try {
            File f = new File("example.txt");

            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello World!\n");
            writer.write("This is a Java Placement Classroom.");
            writer.close();
            System.out.println("End!!");

            Scanner reader = new Scanner(f);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}