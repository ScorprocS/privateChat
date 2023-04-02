package univ_lorraine.iut.java.privatechat.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientCommunication implements Runnable {

    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public ClientCommunication(Socket socket) {
        super();
        this.socket = socket;

    }

    @Override
    public void run() {
        try {
            this.ois = new ObjectInputStream(socket.getInputStream());
            this.oos = new ObjectOutputStream(socket.getOutputStream());

            Message message = (Message) ois.readObject();
            System.out.println(message.toString());

            oos.writeObject("Pong");
            oos.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void close() {
        try {
            // close resources
            ois.close();
            oos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}