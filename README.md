# Java-RMI-example

This project demonstrates a basic example of Remote Method Invocation (RMI) in Java. The program consists of three main components:

1. **RMI Interface** - Defines the remote methods.
2. **RMI Server** - Implements the remote methods and exposes them to clients.
3. **RMI Client** - Connects to the server and calls the remote methods.

The server listens for incoming requests from clients, processes messages, and sends responses. Clients can send multiple messages to the server, and the server will respond with a confirmation message.

## Project Structure

- **RMIInterface**: Defines the remote methods that the server will implement.
- **RMIServer**: Implements the `RMIInterface` methods and binds the object to the RMI registry.
- **RMIClient**: Connects to the RMI registry, looks up the server object, and sends messages to the server.

## Requirements

- **Java**: JDK 21 or later is recommended.
- **Maven**: For building the project and handling dependencies.
