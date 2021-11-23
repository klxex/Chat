import java.util.Vector;

public class RoomManager {

    public static Vector<Room> rooms = new Vector<>();

    public static Room createRoom(String title,String username){
        Room room = new Room();
        rooms.add(room);
        return room;
    }

    public static Vector<Room> showRoom(){
        return rooms;
    }
}
