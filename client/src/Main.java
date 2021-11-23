import org.json.simple.JSONObject;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception{

        Socket socket = new Socket("127.0.0.1",5050);
        OutputStream os = socket.getOutputStream();
        while(true){
            System.out.println("명령어를 입력하세요");
            System.out.println("1.방만들기 2.방 참가하기 3.방나가기 4.전체채팅 5.특정채팅");
            Scanner scan = new Scanner(System.in);
            JSONObject jsonObject = new JSONObject();

            int cmd = scan.nextInt();

            switch(cmd){
                case 1:
                    jsonObject.put("type",Message.CREATEROOM);
                    String pkt = jsonObject.toString();
                    int size = pkt.length();
                    byte[] length = ByteConverter.int2Byte(size);
                    os.write(length);
                    os.write(pkt.getBytes(StandardCharsets.UTF_8));
                    break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
                default:break;
            }

        }

    }
}
