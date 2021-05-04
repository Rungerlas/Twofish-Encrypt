package encriptacionaes;

public class decrip {
    private static byte[] suceess;
    public static byte[] Decript(byte[] text,String key){

        Ripemd_256 ripe = new Ripemd_256();
        Twofish twofish = new Twofish();
        try {
            byte[] hashCode = ripe.getHashCode(key);
            suceess =  twofish.antDecrypt(text,0,twofish.antKey(hashCode));
        }catch(Exception e){
            System.out.println(e);
        }
        return suceess;
    }}
