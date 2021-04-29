package compulsory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main (String[] args) throws IOException {
        String serverAddress = "127.0.0.1"; // The server's IP address
        int PORT = 8100; // The server's port
        try (
                Socket socket = new Socket(serverAddress, PORT);
                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader (
                        new InputStreamReader(socket.getInputStream())) ) {
            // Send a request to the server
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String command=reader.readLine();
            while(!command.equals("exit")){
                out.println(command);

                String response = in.readLine ();
                System.out.println(response);

                reader = new BufferedReader(
                        new InputStreamReader(System.in));
                command=reader.readLine();
            }
          /*  out.println(command);
            String response = in.readLine ();
            System.out.println(response);*/

        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }

}
