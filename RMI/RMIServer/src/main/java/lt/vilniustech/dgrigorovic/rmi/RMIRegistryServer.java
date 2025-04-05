package lt.vilniustech.dgrigorovic.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

/**
 * RMIRegistryServer class sets up the RMI registry and binds the remote object to
 * the registry, allowing clients to connect and interact with it.
 */

public class RMIRegistryServer {
    /**
     * The main method that creates the RMI registry, binds the remote object to the registry,
     * and listens for client connections.
     */
    public static void main(String[] args) {
        try {
            // Create and export the registry
            LocateRegistry.createRegistry(1099);

            // Create the remote object
            MyRMIImplementation obj = new MyRMIImplementation();

            // Bind the object to the registry with a name
            try {
                Naming.rebind("rmi://localhost/MyRMI", obj);
                System.out.println("RMI Server is ready.");
            } catch (MalformedURLException e) {
                System.err.println("MalformedURLException: " + e.getMessage());
            }

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
