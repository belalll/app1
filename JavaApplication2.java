/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.*;



/**
 *
 * @author mobicare
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader (System.in);
        BufferedReader r =new BufferedReader (in);
                
                
          
        String name= r.readLine();
        FileWriter wr= new FileWriter("text.txt");
        BufferedWriter w=new BufferedWriter (wr);
        
        
        while (!(name.equals("stop"))){
            
            System.out.println("you enter"+name);
            name=r.readLine();
            w.write(name);
            w.newLine();
            
        }
        w.close();
    }
    
}
