package lt.vilniustech.dgrigorovic.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * MyRMIImplementation provides the implementation of the {@link MyRMIInterface} interface.
 * This class defines the behavior of the remote methods that clients can invoke.
 * It extends {@link UnicastRemoteObject}, which handles the remote object export and communication.
 */
public class MyRMIImplementation extends UnicastRemoteObject implements MyRMIInterface {

    /**
     * Constructs a new instance of MyRMIImplementation.
     * The constructor is required by the {@link UnicastRemoteObject} class to export the remote object.
     *
     * @throws RemoteException If the remote object cannot be exported due to communication issues.
     */
    protected MyRMIImplementation() throws RemoteException {
        super();
    }

    /**
     * Implements the remote method to send a message from the client to the server.
     * It simply returns a string acknowledging the receipt of the message.
     *
     * @param message The message sent by the client.
     * @return A response message acknowledging the received message.
     * @throws RemoteException if a communication error occurs during the remote method call.
     */
    @Override
    public String sendMessage(String message) throws RemoteException {
        // Handle the message received from the client and send a response
        System.out.println("Received message: " + message);
        return "Server received your message: " + message;
    }
}
