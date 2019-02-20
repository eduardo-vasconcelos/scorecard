
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardovasconcelos
 */
public class GeradorDeWordList {
    
    public static void main(String args[]) throws IOException{
        
        FileWriter writer = new FileWriter("/Volumes/NO NAME/wordList.txt");
        
        /*for(int i = 0;i<1;i++){
            for(int j = 0;j<256;j++){
                for(int k = 0;k<256;k++){
                    for(int y = 0;y<256;y++){
                        for(int o = 0;i<256;o++){
                            writer.write(Integer.toHexString(i)+""+Integer.toHexString(j)+""+Integer.toHexString(k)+""+
                                    Integer.toHexString(y)+""+Integer.toHexString(o)+"\n");
                        }
                    }
                }
                writer.flush();
            }
        }*/
        
        Random rand = new Random(new Date().getTime());
        
        for(int i = 0;i<999999;i++){
            String word = "";
            
            for(int j=0;j<5;j++){
                int aux = Math.abs(rand.nextInt()%100);
                if(aux<10){
                    word+="0"+aux;
                }else{
                    word+=aux;
                }
            }
            
            writer.write(word+"\n");
            
            if(i%1000==0){
                writer.flush();
            }
        }
    
        writer.close();
    }
    
}
