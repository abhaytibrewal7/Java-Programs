package NetworkingPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class day3_2 {
    public static void main(String args[]) throws Exception{
        
        BufferedReader br=new BufferedReader(new FileReader("src\\NetworkingPrograms\\abc.txt.txt"));
        BufferedWriter out=new BufferedWriter(new FileWriter("src\\NetworkingPrograms\\xyz.txt.txt"));
        PrintWriter pw=new PrintWriter(new FileWriter("src\\NetworkingPrograms\\xyz.txt.txt"));
        String s;
        while((s=br.readLine())!=null)
            pw.write(s+"\n");
        
        br.close();
        out.close();
        pw.close();
    }
}
