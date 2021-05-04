package encriptacionaes;
import java.io.File;
import java.io.IOException;
import java.lang.String;

public class write {
    public static String createFile (String path,String filename) throws IOException{
        File file=new File(path+"/"+filename);
        if(!file.exists())
            file.createNewFile();
        return path+"/"+filename;
    }}
