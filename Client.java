import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverIP = "10.110.30.26";
        int serverPort = 4444;

        try (Socket socket = new Socket(serverIP, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println("Connected to the server.");

            String serverMessage;
            while ((serverMessage = in.readLine()) != null) {
                if (serverMessage.equals("-EOF-")) {
                    break;
                }
                System.out.println("Server: " + serverMessage);
            }

            while (true) {
                String clientRequest = Validator.getString("Enter request (or type 'bye' to exit): ");
                out.println(clientRequest); 

                if (clientRequest.equalsIgnoreCase("bye")) {
                    String farewell = in.readLine();
                    System.out.println("Server: " + farewell);
                    break;
                }

                while ((serverMessage = in.readLine()) != null) {
                    if (serverMessage.equals("-EOF-")) {
                        break; 
                    }
                    System.out.println("Server: " + serverMessage);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Client connection closed.");
    }
}
