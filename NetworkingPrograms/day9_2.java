package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day9_2 {
    public static void main(String args[])throws Exception{
        
        URL u=new URL("");
        binaryfile(u);                
    }

    public static void binaryfile(URL u)throws Exception{
        
        URLConnection uc=u.openConnection();
        String content=uc.getContentType();
        int contentlen=uc.getContentLength();
        
        if(content.startsWith("text/") || contentlen==-1)
            throw new IOException("not binary file");
        InputStream in=new BufferedInputStream(uc.getInputStream());
        
        byte[] data=new byte[contentlen];
        int bytesread=0;
        int offset=0;
        
        while(offset < contentlen){
            bytesread=in.read(data,offset,data.length-offset);
            if(bytesread==-1)
                break;
            offset=offset+bytesread;
        }
        in.close();
        if(offset!=contentlen)
            throw new IOException("Only read"+offset+"bytes;Expected"+contentlen+"bytes");
        String filename=u.getFile();
        
        filename=filename.substring(filename.lastIndexOf('/')+1);
        FileOutputStream fout=new FileOutputStream(filename);
        
        fout.write(data);
        fout.flush();
        fout.close();                        
    }
}
