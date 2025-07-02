import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class FileOperationsExample {
    public static void main(String[] args){
        String filePath = "example.txt";
        File file = new File(filePath);

        try{
            if(file.createNewFile()){
                System.out.println("file created "+ file.getName());
            }
            else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
                System.out.println("an error occured while creating the file.");
                e.printStackTrace();
            }
            if(file.exists()){
                System.out.println("file name: "+ file.getName());
                System.out.println("absolute path "+ file.getAbsolutePath());
                System.out.println("writeable: "+ file.canWrite());
                System.out.println("readable: "+ file.canRead());
                System.out.println("File size in bytes: "+ file.length());
                System.out.println("last modified: "+ file.lastModified());
            }else{
                System.out.println("the file doesn't exist");
            }

            //reaading into the file:
            try(FileInputStream fin = new FileInputStream("example.txt")){
                int byteRead;
                while((byteRead = fin.read())!= -1){
                    System.out.print((char) byteRead);
                }
                }catch(IOException e){
                    e.printStackTrace();
                }
            
            //writing into the file:
            try(FileOutputStream fou = new FileOutputStream("exampla.txt")){
                Filewriter 
                writer.write("output.txt");

            }
            
            // if(file.delete()){
            //     System.out.println("deleted the files: "+ file.getName());
            // }else{
            //     System.out.println("failed to delete the file");
            // }
        }
    }

