import java.net.Socket;
import java.util.Vector;

public class UserManager {
    private static Vector<User> users = new Vector<>();

    public static User createUser(Socket socket){
        User user = new User(socket);
        users.add(user);
        return user;
    }

}
