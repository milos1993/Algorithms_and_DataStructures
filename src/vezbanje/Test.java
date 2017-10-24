/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezbanje;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author acer e1
 */
public class Test {

    private static Glavna sporedna = new Sporedna("Petar");
    int i = 2;
    /**
     * 
     */
    public static final int PERA = 20;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
//        FileOutputStream file = new FileOutputStream("text.txt");
//        BufferedOutputStream out = new BufferedOutputStream(file);
//        out.write("POZDRAV SVIMA".getBytes());
//        out.close();
//        
//        FileInputStream fin = new FileInputStream("text.txt");
//        BufferedInputStream in = new BufferedInputStream(fin);
//        int br ;
//        while ((in.read())!=-1) {
//            System.out.print( (char)in.read());
//            
//        }
   Glavna gl = new Glavna("Petar");
   Sporedna sp = new Sporedna("Milovan");
   
   System.out.println(gl.callForPrint());
   System.out.println(sp.callForPrint());
    
    }
}
