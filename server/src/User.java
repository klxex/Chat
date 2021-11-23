
import java.io.*;
import java.net.Socket;


public class User {
    private Socket socket;
    private PrivateChat privateChat;

    public PrivateChat getPrivateChat() {
        return privateChat;
    }

    public void setPrivateChat(PrivateChat privateChat) {
        this.privateChat = privateChat;
    }

    public User(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }


    public void setSocket(Socket socket) {
        this.socket = socket;
    }


}
