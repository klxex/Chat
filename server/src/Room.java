import java.util.Vector;

public class Room {

    private String title;
    private String master;
    private Vector<User> participants = new Vector<>();
    private PublicChat publicChat;

    public PublicChat getPublicChat() {
        return publicChat;
    }

    public void setPublicChat(PublicChat publicChat) {
        this.publicChat = publicChat;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void EnterRoom(User user){

    }

    public void ExitRoom(User user){

    }


}
