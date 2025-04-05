package lt.vilniustech.dgrigorovic.rmi;

import java.rmi.Naming;
import java.util.Scanner;

/**
 * RMIClient class connects to an RMI server and allows the user to send messages
 * to the server and receive responses. It repeatedly asks the user for input
 * until the user types "exit" to quit the application.
 */

public class RMIClient {

    /**
     * The main method that establishes a connection to the RMI server and
     * allows sending messages to the server.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lookup the remote object
            MyRMIInterface obj = (MyRMIInterface) Naming.lookup("rmi://localhost/MyRMI");

            System.out.println("Connected to the RMI Server.");

            // Infinite loop to keep sending messages
            while (true) {
                // Prompt the user for a message
                System.out.print("Enter a message to send to the server (or type 'exit' to quit): ");
                String message = scanner.nextLine();

                // Exit the loop if the user types 'exit'
                if ("exit".equalsIgnoreCase(message)) {
                    System.out.println("Exiting...");
                    break;
                }

                // Call the remote method to send the message
                String response = obj.sendMessage(message);

                // Print the response from the server
                System.out.println("Server Response: " + response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
