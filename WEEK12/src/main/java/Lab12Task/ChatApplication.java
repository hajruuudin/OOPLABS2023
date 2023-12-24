package Lab12Task;

import java.io.*;
import java.net.Socket;

public class ChatApplication {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java ChatApplication server <port>");
            System.out.println("java ChatApplication client <username> <server_ip> <port>");
            System.exit(1);
        }

        String mode = args[0];

        if ("server".equals(mode)) {
            int port = Integer.parseInt(args[1]);
            ChatServer chatServer = new ChatServer();
            chatServer.start(port);
        } else if ("client".equals(mode)) {
            if (args.length < 4) {
                System.out.println("Usage: java ChatApplication client <username> <server_ip> <port>");
                System.exit(1);
            }

            String username = args[1];
            String serverIP = args[2];
            int port = Integer.parseInt(args[3]);

            try (Socket socket = new Socket(serverIP, port);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {


                writer.println(username);


                new Thread(() -> {
                    try {
                        String message;
                        while ((message = reader.readLine()) != null) {
                            System.out.println(message);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();


                String userInput;
                while ((userInput = consoleReader.readLine()) != null) {
                    writer.println(userInput);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
