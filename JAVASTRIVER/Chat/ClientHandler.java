import java.io.*;
import java.net.*;

public class ClientHandler extends Thread {

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String username;

    public ClientHandler(Socket socket) {
        this.socket = socket;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            writer = new PrintWriter(
                    socket.getOutputStream(), true);

            username = reader.readLine();

            System.out.println(username + " joined.");
            Server.broadcast(username + " joined the chat.", this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        writer.println(message);
    }

    @Override
    public void run() {

        String message;

        try {

            while ((message = reader.readLine()) != null) {

                String fullMessage =
                        "[" + username + "] : " + message;

                System.out.println(fullMessage);

                Server.broadcast(fullMessage, this);
            }

        } catch (IOException e) {

            System.out.println(username + " disconnected.");

        } finally {

            Server.removeClient(this);

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}