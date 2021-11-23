public class ByteConverter {

    public static int byte2Int(byte[] src){
        int s1 = src[0] & 0xFF;
        int s2 = src[1] & 0xFF;
        int s3 = src[2] & 0xFF;
        int s4 = src[3] & 0XFF;

        return (s1<<24)+(s2<<16)+(s3<<8)+s4;
    }

    public static byte[] int2Byte(int size){
        byte s[] = new byte[4];
        s[0] = (byte)((size&0xFF000000)>>24);
        s[1] = (byte)((size&0xFF0000)>>16);
        s[2] = (byte)((size&0xFF00)>>8);
        s[3] = (byte)((size&0xFF));
        return s;
    }
}
