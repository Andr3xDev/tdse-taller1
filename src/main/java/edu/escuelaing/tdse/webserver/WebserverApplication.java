package edu.escuelaing.tdse.webserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;

public class WebserverApplication {

    private static final int PORT = 35000;
    private ServerSocket serverSocket;
    private boolean running = true;

    public static void main(String[] args) throws IOException, URISyntaxException {
        WebserverApplication server = new WebserverApplication();
        server.startServer();
    }

    public void startServer() throws IOException, URISyntaxException {
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            throw e;
        }

    }

    public void stopServer() {
        this.running = false;
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                serverSocket.close();
            } catch (IOException e) {
            }
        }
    }

}