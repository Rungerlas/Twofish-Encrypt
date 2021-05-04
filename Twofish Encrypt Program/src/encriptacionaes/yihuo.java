package encriptacionaes;

public class yihuo {
    public static byte[] XOR (byte[] p,byte[] x){
        byte [] result = new byte[16];
        for(int i=0;i<16;i++){
            result[i]=(byte) (p[i]^x[i]);
        }
        return result;
    }
}
