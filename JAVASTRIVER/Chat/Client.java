import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    private static final String SERVER_IP = "127.0.0.1";
    private static final int PORT = 5000;

    public static void main(String[] args) {

        try {

            Socket socket = new Socket(SERVER_IP, PORT);

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));

            PrintWriter writer =
                    new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            writer.println(username);

            Thread receiveThread = new Thread(() -> {

                try {

                    String msg;

                    while ((msg = reader.readLine()) != null) {
                        System.out.println(msg);
                    }

                } catch (IOException e) {
                    System.out.println("Disconnected.");
                }

            });

            receiveThread.start();

            while (true) {

                String message = scanner.nextLine();

                writer.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}