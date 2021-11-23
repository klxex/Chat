import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String args[]) throws Exception{
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8,50,3, TimeUnit.SECONDS,queue);
        ServerSocket serverSocket = new ServerSocket(2000);

        while(true){
            Socket socket = serverSocket.accept();
            threadPoolExecutor.execute(new ThreadA(socket));
            socket.
        }

    }



    static class ThreadA implements Runnable{
        private Socket socket;

        public ThreadA(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            User user = UserManager.createUser(socket);
            try{
                InputStream is = user.getSocket().getInputStream();
                byte[] bytes;
                while(true){
                    bytes = new byte[4];

                    is.read(bytes);
                    int size = ByteConverter.byte2Int(bytes);
                    bytes = new byte[size];
                    is.read(bytes);
                    String msg = bytes.toString();
                    JSONParser jsonParser=new JSONParser();
                    JSONObject jsonObject=(JSONObject) jsonParser.parse(msg);

                    String type = (String)jsonObject.get("type");
                    Message message = Message.valueOf(type);

                    switch(message){
                        case PRivateSEND:break;
                        case
                        case CREATEROOM:break;
                        case ENTERROOM:break;
                        case EXITROOM:break;
                        default: break;
                    }
                }

            }
            catch(Exception e){

            }

        }
    }
}
