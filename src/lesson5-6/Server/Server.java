package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4444)){
            String message;
            System.out.println("Server is running");
            Socket socket = serverSocket.accept();
            System.out.println("Someone connected");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF("From server: Username connected");
            outputStream.flush();
            new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                     DataOutputStream serverOutput = new DataOutputStream(socket.getOutputStream())){
                    while (true) {
                        try {
                            serverOutput.writeUTF("From server: " + reader.readLine());
                            serverOutput.flush();
                        } catch (IOException e) {
                            System.out.println("Server message send error");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            while (!(message = inputStream.readUTF()).trim().equals("/finish")){
                outputStream.writeUTF("User: " + message);
                outputStream.flush();
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("disconnect");
            System.exit(0);
        }
    }
}