

package com.mycompany.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        String name = "mohamed waleed";
        String password = "sec4_43243084";

        try (ServerSocket serverSocket = new ServerSocket(9806)) {
            System.out.println("Server started. Waiting for client...");

            // Wait for a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established with client: " + clientSocket.getInetAddress());

            // Get input and output streams from the client socket
            try (DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                 DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream())) {

                // Read data from client
                String receivedData = in.readUTF();
                System.out.println("Received data: " +"777777777777777");

                // Authenticate client
                if (receivedData ==name + " " + password) {
                    System.out.println("Authentication successful");
                    out.writeUTF("1");
                } else {
                    System.out.println("Authentication failed");
                    out.writeUTF("0");
                }
            } catch (IOException e) {
                System.err.println("Error handling client communication: " + e.getMessage());
            } finally {
                // Close the client socket
                try {
                    clientSocket.close();
                    System.out.println("Client connection closed");
                } catch (IOException e) {
                    System.err.println("Error closing client socket: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
