package NetworkingPrograms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class day3_1 {
    public static void main(String args[])throws Exception{
        
        //new File(".").getAbsoluteFile();
        
                
        File file=new File("src\\NetworkingPrograms\\abc.txt.txt");
        File file2=new File("src\\NetworkingPrograms\\xyz.txt.txt");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        
        //System.out.println(new File(".").getAbsoluteFile());
        DataInputStream fr=new DataInputStream(new FileInputStream("src\\NetworkingPrograms\\abc.txt.txt"));
        DataOutputStream out=new DataOutputStream(new FileOutputStream("src\\NetworkingPrograms\\xyz.txt.txt"));
        
        
        String s;
        while((s=fr.readLine())!=null)
            out.writeBytes(s+"\n");
    
        if(fr!=null)
            fr.close();
        if(out!=null)
            out.close();
    }
}
