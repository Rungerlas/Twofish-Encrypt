package encriptacionaes;

public class test {
    private static byte[] suceess;
    public static byte[] Decript(byte[] text,String key)  {
        Ripemd_256 ripe = new Ripemd_256();
        Twofish twofish = new Twofish();
        try {
            byte[] hashCode = ripe.getHashCode(key);
            suceess =  twofish.antEncrypt(text,0,twofish.antKey(hashCode));
        }catch(Exception e){
            System.out.println(e);
        }
      return suceess;
    }
}
