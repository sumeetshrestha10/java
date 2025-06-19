package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("ssource.txt");
            FileOutputStream fos = new FileOutputStream("destinattion.txt")){
                byte[] buffer = new byte[1024];
                int bytesRead;
                while((bytesRead = fis.read(buffer))!= -1){
                    fos.write(buffer, 0, bytesRead);
                }
        }
        catch(IOException e){
            System.out.println("error copying file "+e.getLocalizedMessage());
        }
    }
    
}


//error copying filejava.io.FileNotFoundException: ssource.txt (The system cannot find the file specified)
// error copying filessource.txt (The system cannot find the file specified)