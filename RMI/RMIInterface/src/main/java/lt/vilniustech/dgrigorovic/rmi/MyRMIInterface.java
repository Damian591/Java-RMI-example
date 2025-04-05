package lt.vilniustech.dgrigorovic.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * MyRMIInterface defines the remote interface that clients can use to communicate with the RMI server.
 * It extends the {@link Remote} interface and provides methods that can be called remotely.
 */
public interface MyRMIInterface extends Remote {

    /**
     * Sends a message to the server and receives a response.
     * This method is remote, meaning it can be invoked from the client side.
     *
     * @return A message from the server, typically a greeting or acknowledgment.
     * @throws RemoteException if a communication error occurs during the remote method call.
     */
    String sendMessage(String message) throws RemoteException; // New method for sending a message
}
