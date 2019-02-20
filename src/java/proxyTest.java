
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardovasconcelos
 */
public class proxyTest {
    
    public static void main(String args[]) throws IOException{
        //Socket socket = new Socket("http://www.freeproxylists.net", 80);
        
        URL url =  new URL("http://proxylist.hidemyass.com");
        URLConnection urlConn = url.openConnection();
        
        urlConn.setDoInput(true); 
        urlConn.setDoOutput(true); 
        urlConn.setUseCaches(false); 
        //urlConn.setRequestProperty ("Content-Type", "application/x-www-form-urlencoded");
                
        DataOutputStream out = new DataOutputStream(urlConn.getOutputStream());
        InputStreamReader in = new InputStreamReader(urlConn.getInputStream());
        
        out.writeBytes("GET /index.html HTTP/1.1 \r\n\r\n");
        out.flush();
        
        char saida[] = new char[50000];
        
                
        in.read(saida);
        
        System.out.println(new String(saida));
        
    }
    
}
